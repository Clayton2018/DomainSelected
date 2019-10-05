package c.repositories.customer;

import c.domain.customer.PaymentMethod;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PaymentMethodRepository extends CrudRepository<PaymentMethod, String> {

    Set<PaymentMethod>getAll();

}
