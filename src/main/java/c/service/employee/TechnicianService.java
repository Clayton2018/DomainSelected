package c.service.employee;

import c.domain.employee.Technician;
import c.service.Service;

import java.util.Set;

public interface TechnicianService extends Service<Technician, Integer> {

    Set<Technician> getAll();

}
