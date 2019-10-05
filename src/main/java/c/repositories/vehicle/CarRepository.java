package c.repositories.vehicle;

import c.domain.vehicle.Car;
import c.domain.vehicle.Vehicle;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CarRepository extends CrudRepository<Car, String> {

    Set<Car>getAll();

}
