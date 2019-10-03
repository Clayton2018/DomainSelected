package c.service.customer;

import c.domain.customer.PaymentMethod;
import c.service.Service;

import java.util.Set;

public interface PaymentMethodService extends Service<PaymentMethod, String> {

    Set<PaymentMethod>getAll();

}
