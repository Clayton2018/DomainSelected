package c.repositories.customer;

import c.domain.customer.Customer;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Set<Customer>getAll();

}
