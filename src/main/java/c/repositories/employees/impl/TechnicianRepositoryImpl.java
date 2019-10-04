package c.repositories.employees.impl;

import c.domain.employee.Technician;
import c.repositories.employees.TechnicianRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class TechnicianRepositoryImpl implements TechnicianRepository {

    private static TechnicianRepositoryImpl technicianRepo = null;
    private Map<Integer, Technician> technicianEmp;

    public TechnicianRepositoryImpl(){

        technicianEmp = new HashMap<>();

    }

    public static TechnicianRepositoryImpl getTechnicianRepo(){

        if(technicianRepo == null){

            return new TechnicianRepositoryImpl();

        }

        return technicianRepo;

    }

    @Override
    public Set<Technician> getAll() {
        return new HashSet<>(technicianEmp.values());
    }

    @Override
    public Technician create(Technician technician) {

        technicianEmp.put(technician.getEmpID(), technician);
        return technician;
    }

    @Override
    public Technician read(Integer integer) {

        return technicianEmp.get(integer);
    }

    @Override
    public Technician update(Technician technician) {

        technicianEmp.replace(technician.getEmpID(), technician);
        return technicianEmp.get(technician.getEmpID());
    }

    @Override
    public void delete(Integer integer) {

        technicianEmp.remove(integer);

    }
}
