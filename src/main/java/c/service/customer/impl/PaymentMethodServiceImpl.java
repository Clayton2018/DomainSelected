package c.service.customer.impl;

import c.domain.customer.PaymentMethod;
import c.repositories.customer.PaymentMethodRepository;
import c.repositories.customer.impl.PaymentMethodRepositoryImpl;
import c.service.customer.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("PaymentMethodServiceImpl")
public class PaymentMethodServiceImpl implements PaymentMethodService {

    private PaymentMethodServiceImpl service = null;
    @Autowired
    private PaymentMethodRepository repository;

    public PaymentMethodServiceImpl() {

        this.repository = PaymentMethodRepositoryImpl.getPaymentMethodRepo();

    }

    public PaymentMethodServiceImpl getService() {

        if (service == null){

            return new PaymentMethodServiceImpl();

        }
        return service;
    }

    @Override
    public Set<PaymentMethod> getAll() {
        return repository.getAll();
    }

    @Override
    public PaymentMethod create(PaymentMethod paymentMethod) {
        return repository.create(paymentMethod);
    }

    @Override
    public PaymentMethod read(String str) {
        return repository.read(str);
    }

    @Override
    public PaymentMethod update(PaymentMethod paymentMethod) {
        return repository.update(paymentMethod);
    }

    @Override
    public void delete(String str) {

        repository.delete(str);

    }
}
