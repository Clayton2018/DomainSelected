package c.repositories.employees;

import c.domain.employee.VehicleInspector;
import c.repositories.Repository;

import java.util.Set;

public interface VehicleInspectorRepository extends Repository<VehicleInspector, Integer> {

    Set<VehicleInspector> getAll();

}
