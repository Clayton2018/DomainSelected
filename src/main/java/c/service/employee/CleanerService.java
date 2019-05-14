package c.service.employee;

import c.domain.employee.Cleaner;
import c.service.Service;

import java.util.Set;

public interface CleanerService extends Service<Cleaner, Integer> {

    Set<Cleaner> getAll();

}
