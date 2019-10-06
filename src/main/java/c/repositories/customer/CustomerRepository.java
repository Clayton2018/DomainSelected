package c.repositories.customer;

import c.domain.customer.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    //Set<Customer>getAll();

}
