package c.service.vehicleservice.impl;

import c.domain.vehicleservice.VehicleService;
import c.repositories.vehicleservice.VehicleServiceRepository;
import c.service.vehicleservice.VehicleServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("VehicleServiceServiceImpl")
public class VehicleServiceServiceImpl implements VehicleServiceService {

    private VehicleServiceServiceImpl service = null;
    @Autowired
    private VehicleServiceRepository repository;

    public VehicleServiceServiceImpl() {

        //this.repository = VehicleServiceRepositoryImpl.getVehicleServiceRepo();

    }

    public VehicleServiceServiceImpl getService() {

        if (service == null){

            return new VehicleServiceServiceImpl();

        }

        return service;

    }

    @Override
    public Set<VehicleService> getAll() {

        List<VehicleService> vehicleServiceList = (List<VehicleService>) repository.findAll();
        return new HashSet<>(vehicleServiceList);

    }

    @Override
    public VehicleService create(VehicleService vehicleService) {
        return repository.save(vehicleService);
    }

    @Override
    public VehicleService read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public VehicleService update(VehicleService vehicleService) {
        return repository.save(vehicleService);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
