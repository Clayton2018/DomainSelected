package c.repositories.vehicle;

import c.domain.vehicle.Vehicle;
import c.repositories.Repository;

import java.util.Set;

public interface CarRepository extends Repository<Vehicle, Integer> {

    Set<Vehicle>getAll();

}
