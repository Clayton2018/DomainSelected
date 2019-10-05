package c.repositories.employees;

import c.domain.employee.Panelbeater;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PanelbeaterRepository extends CrudRepository<Panelbeater, Integer> {

    Set<Panelbeater>getAll();

}
