package c.service.employee.impl;

import c.domain.employee.VehicleInspector;
import c.repositories.employees.VehicleInspectorRepository;
import c.service.employee.VehicleInspectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("VehicleInspectorServiceImpl")
public class VehicleInspectorServiceImpl implements VehicleInspectorService {

    private VehicleInspectorServiceImpl service = null;
    @Autowired
    private VehicleInspectorRepository repository;

    public VehicleInspectorServiceImpl(){

        //this.repository = VehicleInspectorRepositoryImpl.getVehicleInspectorRepo();

    }

    public VehicleInspectorServiceImpl getService() {

        if(service == null){

            service = new VehicleInspectorServiceImpl();

        }

        return service;
    }

    @Override
    public Set<VehicleInspector> getAll() {

        List<VehicleInspector> vehicleInspectorList = (List<VehicleInspector>) repository.findAll();
        return new HashSet<>(vehicleInspectorList);

    }

    @Override
    public VehicleInspector create(VehicleInspector vehicleInspector) {
        return repository.save(vehicleInspector);
    }

    @Override
    public VehicleInspector read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public VehicleInspector update(VehicleInspector vehicleInspector) {
        return repository.save(vehicleInspector);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
