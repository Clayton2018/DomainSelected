package c.service.vehicleservice.impl;

import c.domain.vehicleservice.VehicleService;
import c.repositories.vehicleservice.VehicleServiceRepository;
import c.repositories.vehicleservice.impl.VehicleServiceRepositoryImpl;
import c.service.vehicleservice.VehicleServiceService;

import java.util.Set;

public class VehicleServiceServiceImpl implements VehicleServiceService {

    private VehicleServiceServiceImpl service = null;
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
