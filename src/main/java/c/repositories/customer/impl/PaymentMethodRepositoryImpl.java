package c.repositories.customer.impl;

import c.domain.customer.PaymentMethod;
import c.repositories.customer.PaymentMethodRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class PaymentMethodRepositoryImpl implements PaymentMethodRepository {

    private static PaymentMethodRepositoryImpl paymentMethodRepo = null;
    private Map<String, PaymentMethod> paymentMethodCode;

    public PaymentMethodRepositoryImpl() {

        paymentMethodCode = new HashMap<>();

    }

    public static PaymentMethodRepositoryImpl getPaymentMethodRepo() {

        if (paymentMethodRepo == null){

            return new PaymentMethodRepositoryImpl();

        }

        return paymentMethodRepo;

    }

    @Override
    public Set<PaymentMethod> getAll() {
        return new HashSet<>(paymentMethodCode.values());
    }

    @Override
    public PaymentMethod create(PaymentMethod paymentMethod) {

        paymentMethodCode.put(paymentMethod.getPayType(), paymentMethod);
        return paymentMethod;

    }

    @Override
    public PaymentMethod read(String str) {
        return paymentMethodCode.get(str);
    }

    @Override
    public PaymentMethod update(PaymentMethod paymentMethod) {

        paymentMethodCode.replace(paymentMethod.getPayType(), paymentMethod);
        return paymentMethodCode.get(paymentMethod.getPayType());

    }

    @Override
    public void delete(String str) {

        paymentMethodCode.remove(str);

    }
}
