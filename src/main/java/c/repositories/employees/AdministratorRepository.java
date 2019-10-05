package c.repositories.employees;

import c.domain.employee.Administrator;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AdministratorRepository extends CrudRepository<Administrator, Integer> {

    Set<Administrator> getAll();

}
