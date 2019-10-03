package c.service.customer;

import c.domain.customer.Customer;
import c.service.Service;

import java.util.Set;

public interface CustomerService extends Service<Customer, Integer> {

    Set<Customer>getAll();

}
