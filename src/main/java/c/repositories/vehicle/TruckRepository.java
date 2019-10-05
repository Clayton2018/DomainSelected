package c.repositories.vehicle;

import c.domain.vehicle.Truck;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TruckRepository extends CrudRepository<Truck, String> {

    Set<Truck>getAll();

}
