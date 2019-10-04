package c.repositories.customer.impl;

import c.domain.customer.Customer;
import c.repositories.customer.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl customerRepo = null;
    private Map<Integer, Customer> customerCode;

    public CustomerRepositoryImpl() {

        customerCode = new HashMap<>();

    }

    public static CustomerRepositoryImpl getCustomerRepo() {

        if (customerRepo == null){

            return new CustomerRepositoryImpl();

        }

        return customerRepo;

    }

    @Override
    public Set<Customer> getAll() {

        return new HashSet<>(customerCode.values());

    }

    @Override
    public Customer create(Customer customer) {

        customerCode.put(customer.getCustomerID(), customer);
        return customer;

    }

    @Override
    public Customer read(Integer integer) {
        return customerCode.get(integer);
    }

    @Override
    public Customer update(Customer customer) {

        customerCode.replace(customer.getCustomerID(), customer);
        return customerCode.get(customer.getCustomerID());

    }

    @Override
    public void delete(Integer integer) {

        customerCode.remove(integer);

    }
}
