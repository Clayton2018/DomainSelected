package c.service.employee;

import c.domain.employee.Mechanic;
import c.service.Service;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Set;

public interface MechanicService extends Service<Mechanic, ID> {

    Set<Mechanic>getAll();

}
