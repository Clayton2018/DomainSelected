package c.service.customer.impl;

import c.domain.customer.Invoice;
import c.repositories.customer.InvoiceRepository;
import c.service.customer.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("InvoiceServiceImpl")
public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceServiceImpl service = null;
    @Autowired
    private InvoiceRepository repository;


    public InvoiceServiceImpl() {

        //this.repository = InvoiceRepositoryImpl.getInvoiceRepo();

    }

    public InvoiceServiceImpl getService() {

        if (service == null){

            return new InvoiceServiceImpl();

        }

        return service;
    }

    @Override
    public Set<Invoice> getAll() {

        List<Invoice> invoiceList = (List<Invoice>) repository.findAll();
        return new HashSet<>(invoiceList);
    }

    @Override
    public Invoice create(Invoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public Invoice read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Invoice update(Invoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
