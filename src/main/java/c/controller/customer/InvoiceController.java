package c.controller.customer;


import c.domain.customer.Invoice;
import c.service.customer.impl.InvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {


    @Autowired
    @Qualifier("InvoiceServiceImpl")
    private InvoiceServiceImpl invoiceService;


    @PostMapping("/new")
    public Invoice create(@RequestBody Invoice invoice){

        return invoiceService.create(invoice);

    }

    @GetMapping(path = "/find/{id}")
    public Invoice findById(@PathVariable int id){

        Invoice inv = invoiceService.read(id);
        return inv;

    }

    @PutMapping("/update")
    public void update(@RequestBody Invoice invoice){

        invoiceService.update(invoice);

    }

    @DeleteMapping(path ="/delete/{id}")
    public void delete(@PathVariable int id){

        invoiceService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Invoice> getAll(){

        return invoiceService.getAll();

    }

}
