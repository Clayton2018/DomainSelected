package c.repositories.customer.impl;

import c.domain.customer.Invoice;
import c.repositories.customer.InvoiceRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class InvoiceRepositoryImpl implements InvoiceRepository {

    private static InvoiceRepositoryImpl invoiceRepo = null;
    private Map<Integer, Invoice> invoiceCode;

    public InvoiceRepositoryImpl() {

        invoiceCode = new HashMap<>();

    }

    public static InvoiceRepositoryImpl getInvoiceRepo() {

        if (invoiceRepo == null){

            return new InvoiceRepositoryImpl();

        }

        return invoiceRepo;
    }

    @Override
    public Set<Invoice> getAll() {
        return new HashSet<>(invoiceCode.values());
    }

    @Override
    public Invoice create(Invoice invoice) {

        invoiceCode.put(invoice.getInvoiceNum(), invoice);
        return invoice;

    }

    @Override
    public Invoice read(Integer integer) {
        return invoiceCode.get(integer);
    }

    @Override
    public Invoice update(Invoice invoice) {

        invoiceCode.replace(invoice.getInvoiceNum(), invoice);
        return invoiceCode.get(invoice.getInvoiceNum());
    }

    @Override
    public void delete(Integer integer) {

        invoiceCode.remove(integer);

    }
}
