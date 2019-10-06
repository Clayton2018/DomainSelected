package c.repositories.employees;

import c.domain.employee.Administrator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface AdministratorRepository extends CrudRepository<Administrator, Integer> {

    //Set<Administrator> getAll();

}
