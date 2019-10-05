package c.repositories.employees;

import c.domain.employee.VehicleInspector;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface VehicleInspectorRepository extends CrudRepository<VehicleInspector, Integer> {

    Set<VehicleInspector> getAll();

}
