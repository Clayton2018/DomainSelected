package c.service.employee.impl;

import c.domain.employee.VehicleInspector;
import c.repositories.employees.VehicleInspectorRepository;
import c.service.employee.VehicleInspectorService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("VehicleInspectorServiceImpl")
public class VehicleInspectorServiceImpl implements VehicleInspectorService {

    private VehicleInspectorServiceImpl service;
    private VehicleInspectorRepository repository;

    public VehicleInspectorServiceImpl(){

        this.repository = VehicleInspectorServiceImpl.getVehicleInspectorRepository();

    }

    public VehicleInspectorServiceImpl getService() {

        if(service == null){

            service = new VehicleInspectorServiceImpl();

        }

        return service;
    }

    @Override
    public Set<VehicleInspector> getAll() {
        return repository.getAll();
    }

    @Override
    public VehicleInspector create(VehicleInspector vehicleInspector) {
        return repository.create(vehicleInspector);
    }

    @Override
    public VehicleInspector read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public VehicleInspector update(VehicleInspector vehicleInspector) {
        return repository.update(vehicleInspector);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
