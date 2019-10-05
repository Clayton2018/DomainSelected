package c.repositories.employees;

import c.domain.employee.VehicleInspector;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface VehicleInspectorRepository extends CrudRepository<VehicleInspector, Integer> {

    Set<VehicleInspector> getAll();

}
