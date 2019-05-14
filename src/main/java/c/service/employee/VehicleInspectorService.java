package c.service.employee;

import c.domain.employee.VehicleInspector;
import c.service.Service;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Set;

public interface VehicleInspectorService extends Service<VehicleInspector, ID> {

    Set<VehicleInspector>getAll();

}
