package c.repositories.vehicleservice;

import c.domain.vehicleservice.VehicleService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface VehicleServiceRepository extends CrudRepository<VehicleService, Integer> {

    //Set<VehicleService>getAll();

}
