package c.repositories.employees;

import c.domain.employee.Panelbeater;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface PanelbeaterRepository extends CrudRepository<Panelbeater, Integer> {

    //Set<Panelbeater>getAll();

}
