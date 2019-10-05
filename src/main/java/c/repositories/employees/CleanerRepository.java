package c.repositories.employees;

import c.domain.employee.Cleaner;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CleanerRepository extends CrudRepository<Cleaner, Integer> {

    Set<Cleaner> getAll();

}
