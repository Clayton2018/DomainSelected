package c.service.employee;

import c.domain.employee.Mechanic;
import c.service.Service;

import java.util.Set;

public interface MechanicService extends Service<Mechanic, Integer> {

    Set<Mechanic>getAll();

}
