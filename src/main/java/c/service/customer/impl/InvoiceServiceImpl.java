package c.service.customer.impl;

import c.domain.customer.Invoice;
import c.repositories.customer.InvoiceRepository;
import c.repositories.customer.impl.InvoiceRepositoryImpl;
import c.service.customer.InvoiceService;

import java.util.Set;

public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceServiceImpl service = null;
    private InvoiceRepository repository;


    public InvoiceServiceImpl() {

        this.repository = InvoiceRepositoryImpl.getInvoiceRepo();

    }

    public InvoiceServiceImpl getService() {

        if (service == null){

            return new InvoiceServiceImpl();

        }

        return service;
    }

    @Override
    public Set<Invoice> getAll() {
        return repository.getAll();
    }

    @Override
    public Invoice create(Invoice invoice) {
        return repository.create(invoice);
    }

    @Override
    public Invoice read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Invoice update(Invoice invoice) {
        return repository.update(invoice);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
