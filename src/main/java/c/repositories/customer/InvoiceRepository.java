package c.repositories.customer;

import c.domain.customer.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

    //Set<Invoice>getAll();

}
