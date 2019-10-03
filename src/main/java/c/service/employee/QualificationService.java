package c.service.employee;

import c.domain.employee.Qualification;
import c.service.Service;

import java.util.Set;

public interface QualificationService extends Service<Qualification, Integer> {

    Set<Qualification>getAll();

}
