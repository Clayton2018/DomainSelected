package c.service.vehicle;

import c.domain.vehicle.Car;
import c.service.Service;

import java.util.Set;

public interface CarService extends Service<Car, String> {

    Set<Car>getAll();

}
