package c.repositories.employees;

import c.domain.employee.Technician;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface TechnicianRepository extends CrudRepository<Technician, Integer> {

    Set<Technician> getAll();
}
