package c.repositories.vehicle;

import c.domain.vehicle.Truck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface TruckRepository extends CrudRepository<Truck, String> {

    Set<Truck>getAll();

}
