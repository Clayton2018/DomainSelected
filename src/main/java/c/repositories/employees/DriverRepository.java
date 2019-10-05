package c.repositories.employees;

import c.domain.employee.Driver;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface DriverRepository extends CrudRepository<Driver, Integer> {

    Set<Driver>getAll();

}
