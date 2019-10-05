/*package c.repositories.employees.impl;

import c.domain.employee.Cleaner;
import c.repositories.employees.CleanerRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class CleanerRepositoryImpl implements CleanerRepository {

    private static CleanerRepositoryImpl cleanerRepo = null;
    private Map<Integer, Cleaner> cleanerEmp;

    public CleanerRepositoryImpl(){

        cleanerEmp = new HashMap<>();

    }

    public static CleanerRepositoryImpl getCleanerRepo(){

        if(cleanerRepo == null){

            return new CleanerRepositoryImpl();

        }

        return cleanerRepo;

    }

    @Override
    public Set<Cleaner> getAll() {
        return new HashSet<>(cleanerEmp.values());
    }

    @Override
    public Cleaner create(Cleaner cleaner) {

        cleanerEmp.put(cleaner.getEmpID(), cleaner);
        return cleaner;
    }

    @Override
    public Cleaner read(Integer integer) {

        return cleanerEmp.get(integer);
    }

    @Override
    public Cleaner update(Cleaner cleaner) {

        cleanerEmp.replace(cleaner.getEmpID(), cleaner);
        return cleanerEmp.get(cleaner.getEmpID());
    }

    @Override
    public void delete(Integer integer) {

        cleanerEmp.remove(integer);

    }
}

 */
