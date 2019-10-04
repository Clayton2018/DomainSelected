package c.service.customer.impl;

import c.domain.customer.Customer;
import c.repositories.customer.CustomerRepository;
import c.repositories.customer.impl.CustomerRepositoryImpl;
import c.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CustomerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

    private CustomerServiceImpl service = null;

    @Autowired
    private CustomerRepository repository;

    public CustomerServiceImpl() {

        this.repository = CustomerRepositoryImpl.getCustomerRepo();

    }

    public CustomerServiceImpl getService() {

        if (service == null){

            return new CustomerServiceImpl();


        }

        return service;

    }

    @Override
    public Set<Customer> getAll() {
        return repository.getAll();
    }

    @Override
    public Customer create(Customer customer) {
        return repository.create(customer);
    }

    @Override
    public Customer read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.update(customer);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
