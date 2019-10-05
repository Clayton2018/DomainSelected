package c.repositories.customer;

import c.domain.customer.Invoice;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

    Set<Invoice>getAll();

}
