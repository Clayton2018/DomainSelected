package c.repositories.employees.impl;

import c.domain.employee.VehicleInspector;
import c.repositories.employees.VehicleInspectorRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class VehicleInspectorRepositoryImpl implements VehicleInspectorRepository {

    private static VehicleInspectorRepositoryImpl vehicleInspectorRepo = null;
    private Map<Integer, VehicleInspector> vehicleInspectorEmp;

    public VehicleInspectorRepositoryImpl(){

        vehicleInspectorEmp = new HashMap<>();

    }

    public static VehicleInspectorRepositoryImpl getVehicleInspectorRepo(){

        if(vehicleInspectorRepo == null){

            return new VehicleInspectorRepositoryImpl();

        }

        return vehicleInspectorRepo;

    }

    @Override
    public Set<VehicleInspector> getAll() {
        return new HashSet<>(vehicleInspectorEmp.values());
    }

    @Override
    public VehicleInspector create(VehicleInspector vehicleInspector) {

        vehicleInspectorEmp.put(vehicleInspector.getEmpID(), vehicleInspector);
        return vehicleInspector;
    }

    @Override
    public VehicleInspector read(Integer integer) {

        return vehicleInspectorEmp.get(integer);
    }

    @Override
    public VehicleInspector update(VehicleInspector vehicleInspector) {

        vehicleInspectorEmp.replace(vehicleInspector.getEmpID(), vehicleInspector);
        return vehicleInspectorEmp.get(vehicleInspector.getEmpID());
    }

    @Override
    public void delete(Integer integer) {

        vehicleInspectorEmp.remove(integer);

    }

}
