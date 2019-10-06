package c.repositories.employees;

import c.domain.employee.Qualification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface QualificationRepository extends CrudRepository<Qualification, Integer> {

    //Set<Qualification> getAll();

}
