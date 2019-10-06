package c.repositories.employees;

import c.domain.employee.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {

    //Set<Driver>getAll();

}
