package c.repositories.vehicleservice.impl;

import c.domain.vehicleservice.VehicleService;
import c.repositories.vehicleservice.VehicleServiceRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VehicleServiceRepositoryImpl implements VehicleServiceRepository {

    private static VehicleServiceRepositoryImpl vehicleServiceRepo = null;
    private Map<Integer, VehicleService> vehicleServiceCode;

    public VehicleServiceRepositoryImpl() {

        vehicleServiceCode = new HashMap<>();

    }


    public static VehicleServiceRepositoryImpl getVehicleServiceRepo() {

        if (vehicleServiceRepo == null){

            return new VehicleServiceRepositoryImpl();

        }

        return vehicleServiceRepo;

    }

    @Override
    public Set<VehicleService> getAll() {
        return new HashSet<>(vehicleServiceCode.values());
    }

    @Override
    public VehicleService create(VehicleService vehicleService) {

        vehicleServiceCode.put(vehicleService.getServiceID(), vehicleService);
        return vehicleService;

    }

    @Override
    public VehicleService read(Integer integer) {
        return vehicleServiceCode.get(integer);
    }

    @Override
    public VehicleService update(VehicleService vehicleService) {

        vehicleServiceCode.replace(vehicleService.getServiceID(), vehicleService);
        return vehicleServiceCode.get(vehicleService.getServiceID());

    }

    @Override
    public void delete(Integer integer) {

        vehicleServiceCode.remove(integer);

    }
}
