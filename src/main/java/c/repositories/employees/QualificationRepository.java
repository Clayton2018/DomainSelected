package c.repositories.employees;

import c.domain.employee.Qualification;
import c.repositories.Repository;

import java.util.Set;

public interface QualificationRepository extends Repository<Qualification, Integer> {

    Set<Qualification> getAll();

}
