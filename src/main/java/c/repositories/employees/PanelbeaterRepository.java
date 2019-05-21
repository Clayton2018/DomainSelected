package c.repositories.employees;

import c.domain.employee.Panelbeater;
import c.repositories.Repository;

import java.util.Set;

public interface PanelbeaterRepository extends Repository<Panelbeater, Integer> {

    Set<Panelbeater>getAll();

}
