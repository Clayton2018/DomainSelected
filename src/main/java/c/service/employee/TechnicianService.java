package c.service.employee;

import c.domain.employee.Technician;
import c.service.Service;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Set;

public interface TechnicianService extends Service<Technician, ID> {

    Set<Technician> getAll();

}
