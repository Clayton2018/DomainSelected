package c.service.customer.impl;

import c.domain.customer.Customer;
import c.repositories.customer.CustomerRepository;
import c.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("CustomerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

    private CustomerServiceImpl service = null;

    @Autowired
    private CustomerRepository repository;

    public CustomerServiceImpl() {

        //this.repository = CustomerRepositoryImpl.getCustomerRepo();

    }

    public CustomerServiceImpl getService() {

        if (service == null){

            return new CustomerServiceImpl();


        }

        return service;

    }

    @Override
    public Set<Customer> getAll() {

        List<Customer> customerList = (List<Customer>) repository.findAll();
        return new HashSet<>(customerList);
    }

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
