package c.repositories.employees;

import c.domain.employee.Cleaner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface CleanerRepository extends CrudRepository<Cleaner, Integer> {

    Set<Cleaner> getAll();

}
