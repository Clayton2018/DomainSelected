package c.repositories.customer;

import c.domain.customer.Insurance;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface InsuranceRepository extends CrudRepository<Insurance, Integer> {

    Set<Insurance>getAll();

}
