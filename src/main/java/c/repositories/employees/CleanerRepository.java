package c.repositories.employees;

import c.domain.employee.Cleaner;
import c.repositories.Repository;

import java.util.Set;

public interface CleanerRepository extends Repository<Cleaner, Integer> {

    Set<Cleaner> getAll();

}
