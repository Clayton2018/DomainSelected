package c.service.customer.impl;

import c.domain.customer.PaymentMethod;
import c.repositories.customer.PaymentMethodRepository;
import c.service.customer.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("PaymentMethodServiceImpl")
public class PaymentMethodServiceImpl implements PaymentMethodService {

    private PaymentMethodServiceImpl service = null;
    @Autowired
    private PaymentMethodRepository repository;

    public PaymentMethodServiceImpl() {

       // this.repository = PaymentMethodRepositoryImpl.getPaymentMethodRepo();

    }

    public PaymentMethodServiceImpl getService() {

        if (service == null){

            return new PaymentMethodServiceImpl();

        }
        return service;
    }

    @Override
    public Set<PaymentMethod> getAll() {

        List<PaymentMethod> paymentMethod = (List<PaymentMethod>) repository.findAll();
        return new HashSet<>(paymentMethod);

    }

    @Override
    public PaymentMethod create(PaymentMethod paymentMethod) {
        return repository.save(paymentMethod);
    }

    @Override
    public PaymentMethod read(String str) {
        return repository.findById(str).orElse(null);
    }

    @Override
    public PaymentMethod update(PaymentMethod paymentMethod) {
        return repository.save(paymentMethod);
    }

    @Override
    public void delete(String str) {

        repository.deleteById(str);

    }
}
