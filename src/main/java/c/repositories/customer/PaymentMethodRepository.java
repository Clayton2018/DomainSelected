package c.repositories.customer;

import c.domain.customer.PaymentMethod;
import c.repositories.Repository;

import java.util.Set;

public interface PaymentMethodRepository extends Repository<PaymentMethod, String> {

    Set<PaymentMethod>getAll();

}
