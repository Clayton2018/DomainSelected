package c.service.employee;

import c.domain.employee.Administrator;
import c.service.Service;

import java.util.Set;

public interface AdministratorService extends Service<Administrator, Integer> {

    Set<Administrator> getAll();

}
