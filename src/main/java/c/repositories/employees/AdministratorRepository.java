package c.repositories.employees;

import c.domain.employee.Administrator;
import c.repositories.Repository;

import java.util.Set;

public interface AdministratorRepository extends Repository<Administrator, Integer> {

    Set<Administrator> getAll();

}
