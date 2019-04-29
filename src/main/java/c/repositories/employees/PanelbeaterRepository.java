package c.repositories.employees;

import c.domain.employee.Mechanic;
import c.repositories.Repository;

import java.util.Set;

public interface PanelbeaterRepository extends Repository<PanelbeaterRepository, Integer> {

    Set<Mechanic>getAll();

}
