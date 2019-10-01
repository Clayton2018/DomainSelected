package c.repositories.vehicle;

import c.domain.vehicle.Car;
import c.domain.vehicle.Vehicle;
import c.repositories.Repository;

import java.util.Set;

public interface CarRepository extends Repository<Car, String> {

    Set<Car>getAll();

}
