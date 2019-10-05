package c.repositories.employees;

import c.domain.employee.Mechanic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface MechanicRepository extends CrudRepository<Mechanic, Integer> {

    Set<Mechanic>getAll();

}
