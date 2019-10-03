package c.controller.customer;


import c.domain.customer.PaymentMethod;
import c.service.customer.impl.PaymentMethodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/paymentmethod")
public class PaymentMethodController {

    @Autowired
    private PaymentMethodServiceImpl paymentMethodService;

    @PostMapping("/new")
    public PaymentMethod create(@RequestBody PaymentMethod paymentMethod){

        return paymentMethodService.create(paymentMethod);

    }

    @GetMapping(path = "/find/{id}")
    public PaymentMethod findById(@PathVariable String id){

        PaymentMethod pM = paymentMethodService.read(id);
        return pM;

    }

    @PutMapping("/update")
    public void update(@RequestBody PaymentMethod paymentMethod){

        paymentMethodService.update(paymentMethod);

    }

    @DeleteMapping(path ="/delete/{id}")
    public void delete(@PathVariable String id){

        paymentMethodService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<PaymentMethod> getAll(){

        return paymentMethodService.getAll();

    }



}
