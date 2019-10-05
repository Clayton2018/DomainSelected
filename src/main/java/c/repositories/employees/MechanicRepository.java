package c.repositories.employees;

import c.domain.employee.Mechanic;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface MechanicRepository extends CrudRepository<Mechanic, Integer> {

    Set<Mechanic>getAll();

}
