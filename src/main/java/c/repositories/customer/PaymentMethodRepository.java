package c.repositories.customer;

import c.domain.customer.PaymentMethod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface PaymentMethodRepository extends CrudRepository<PaymentMethod, String> {

    Set<PaymentMethod>getAll();

}
