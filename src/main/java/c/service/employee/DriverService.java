package c.service.employee;

import c.domain.employee.Driver;
import c.service.Service;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Set;

public interface DriverService extends Service<Driver, ID> {

     Set<Driver> getAll();

}
