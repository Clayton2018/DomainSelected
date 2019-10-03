package c.repositories.employees;

import c.domain.employee.Driver;
import c.repositories.Repository;

import java.util.Set;

public interface DriverRepository extends Repository<Driver, Integer> {

    Set<Driver>getAll();

}
