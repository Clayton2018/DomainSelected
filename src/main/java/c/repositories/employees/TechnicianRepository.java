package c.repositories.employees;

import c.domain.employee.Technician;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TechnicianRepository extends CrudRepository<Technician, Integer> {

    Set<Technician> getAll();
}
