package c.repositories.customer;

import c.domain.customer.Insurance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Integer> {

    //Set<Insurance>getAll();

}
