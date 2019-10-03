package c.repositories.customer;

import c.domain.customer.Invoice;
import c.repositories.Repository;

import java.util.Set;

public interface InvoiceRepository extends Repository<Invoice, Integer> {

    Set<Invoice>getAll();

}
