package c.service.vehicle;

import c.domain.vehicle.Truck;
import c.service.Service;

import java.util.Set;

public interface TruckService extends Service<Truck, String> {

    Set<Truck>getAll();

}
