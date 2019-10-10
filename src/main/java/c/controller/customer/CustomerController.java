package c.controller.customer;

import c.domain.customer.Customer;
import c.service.customer.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins="http://localhost:4200")
public class CustomerController {

    @Autowired
    @Qualifier("CustomerServiceImpl")
    private CustomerServiceImpl customerService;

    @PostMapping("/new")
    public Customer create(@RequestBody Customer customer){

        return customerService.create(customer);

    }

    @GetMapping(path = "/find/{id}")
    public Customer findById(@PathVariable int id){

        Customer cust = customerService.read(id);
        return cust;

    }

    @PutMapping("/update")
    public void update(@RequestBody Customer customer){

        customerService.update(customer);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable int id){

        customerService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Customer> getAll(){

        return  customerService.getAll();

    }


}
