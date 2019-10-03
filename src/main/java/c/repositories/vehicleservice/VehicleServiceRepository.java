package c.repositories.vehicleservice;

import c.domain.vehicleservice.VehicleService;
import c.repositories.Repository;

import java.util.Set;

public interface VehicleServiceRepository extends Repository<VehicleService, Integer> {

    Set<VehicleService>getAll();

}
