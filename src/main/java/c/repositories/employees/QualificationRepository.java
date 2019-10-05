package c.repositories.employees;

import c.domain.employee.Qualification;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface QualificationRepository extends CrudRepository<Qualification, Integer> {

    Set<Qualification> getAll();

}
