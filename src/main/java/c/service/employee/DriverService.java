package c.service.employee;

import c.domain.employee.Driver;
import c.service.Service;

import java.util.Set;

public interface DriverService extends Service<Driver, Integer> {

     Set<Driver> getAll();

}
