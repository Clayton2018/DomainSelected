package c.repositories.vehicleservice;

import c.domain.vehicleservice.VehicleService;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface VehicleServiceRepository extends CrudRepository<VehicleService, Integer> {

    Set<VehicleService>getAll();

}
