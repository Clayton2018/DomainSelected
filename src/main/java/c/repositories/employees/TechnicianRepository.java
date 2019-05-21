package c.repositories.employees;

import c.domain.employee.Technician;
import c.repositories.Repository;

import java.util.Set;

public interface TechnicianRepository extends Repository<Technician, Integer> {

    Set<Technician> getAll();
}
