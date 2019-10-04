package c.service.vehicleservice.impl;

import c.domain.vehicleservice.VehicleService;
import c.repositories.vehicleservice.VehicleServiceRepository;
import c.repositories.vehicleservice.impl.VehicleServiceRepositoryImpl;
import c.service.vehicleservice.VehicleServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("VehicleServiceServiceImpl")
public class VehicleServiceServiceImpl implements VehicleServiceService {

    private VehicleServiceServiceImpl service = null;
    @Autowired
    private VehicleServiceRepository repository;

    public VehicleServiceServiceImpl() {

        this.repository = VehicleServiceRepositoryImpl.getVehicleServiceRepo();

    }

    public VehicleServiceServiceImpl getService() {

        if (service == null){

            return new VehicleServiceServiceImpl();

        }

        return service;

    }

    @Override
    public Set<VehicleService> getAll() {
        return repository.getAll();
    }

    @Override
    public VehicleService create(VehicleService vehicleService) {
        return repository.create(vehicleService);
    }

    @Override
    public VehicleService read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public VehicleService update(VehicleService vehicleService) {
        return repository.update(vehicleService);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
