package c.service.customer;

import c.domain.customer.Invoice;
import c.service.Service;

import java.util.Set;

public interface InvoiceService extends Service<Invoice, Integer> {

    Set<Invoice>getAll();

}
