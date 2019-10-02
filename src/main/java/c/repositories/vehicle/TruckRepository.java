package c.repositories.vehicle;

import c.domain.vehicle.Truck;
import c.repositories.Repository;

import java.util.Set;

public interface TruckRepository extends Repository<Truck, String> {

    Set<Truck>getAll();

}
