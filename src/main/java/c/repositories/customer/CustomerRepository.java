package c.repositories.customer;

import c.domain.customer.Customer;
import c.repositories.Repository;

import java.util.Set;

public interface CustomerRepository extends Repository<Customer, Integer> {

    Set<Customer>getAll();

}
