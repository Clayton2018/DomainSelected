package c.repositories.employees.impl;

import c.domain.employee.Mechanic;
import c.repositories.employees.MechanicRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MechanicRepositoryImpl implements MechanicRepository {



    private static MechanicRepositoryImpl mechanicRepo = null;
    private Map<Integer, Mechanic> mechanicEmp;

    public MechanicRepositoryImpl(){

        mechanicEmp = new HashMap<>();

    }

    public static MechanicRepositoryImpl getMechanicRepo(){

        if(mechanicRepo == null){

            return new MechanicRepositoryImpl();

        }

        return mechanicRepo;

    }

    @Override
    public Set<Mechanic> getAll() {
        return new HashSet<>(mechanicEmp.values());
    }

    @Override
    public Mechanic create(Mechanic mechanic) {

        mechanicEmp.put(mechanic.getEmpID(), mechanic);
        return mechanic;
    }

    @Override
    public Mechanic read(Integer integer) {

        return mechanicEmp.get(integer);
    }

    @Override
    public Mechanic update(Mechanic mechanic) {

        mechanicEmp.replace(mechanic.getEmpID(), mechanic);
        return mechanicEmp.get(mechanic.getEmpID());
    }

    @Override
    public void delete(Integer integer) {

        mechanicEmp.remove(integer);

    }
}
