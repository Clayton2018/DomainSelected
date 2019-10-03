package c.service.employee;

import c.domain.employee.VehicleInspector;
import c.service.Service;


import java.util.Set;

public interface VehicleInspectorService extends Service<VehicleInspector, Integer> {

    Set<VehicleInspector>getAll();

}
