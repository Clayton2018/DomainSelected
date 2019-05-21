package c.service.employee.impl;

import c.repositories.employees.VehicleInspectorRepository;
import c.service.employee.VehicleInspectorService;
import org.springframework.stereotype.Service;

@Service("VehicleInspectorServiceImpl")
public class VehicleInspectorServiceImpl implements VehicleInspectorService {

    private VehicleInspectorServiceImpl service;
    private VehicleInspectorRepository repository;

    public VehicleInspectorServiceImpl(){

        this.repository = VehicleInspectorServiceImpl.getVehicleInspectorRepository();

    }

    public VehicleInspectorServiceImpl getService() {

        if(service == null){}

        return service;
    }
}
