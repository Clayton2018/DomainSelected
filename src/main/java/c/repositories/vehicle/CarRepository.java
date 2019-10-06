package c.repositories.vehicle;

import c.domain.vehicle.Car;
import c.domain.vehicle.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface CarRepository extends CrudRepository<Car, String> {

    //Set<Car>getAll();

}
