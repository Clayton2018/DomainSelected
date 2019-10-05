/*package c.repositories.vehicle.impl;

import c.domain.employee.Administrator;
import c.domain.vehicle.Car;
import c.repositories.vehicle.CarRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class CarRepositoryImpl implements CarRepository {

    private static CarRepositoryImpl carRepo = null;
    private Map<String, Car> carCode;

    public CarRepositoryImpl() {

        carCode = new HashMap<>();

    }

    public static CarRepositoryImpl getCarRepo() {

        if(carRepo == null){

            return new CarRepositoryImpl();

        }

        return carRepo;

    }

    @Override
    public Set<Car> getAll() {
        return new HashSet<>(carCode.values());
    }

    @Override
    public Car create(Car car) {

        carCode.put(car.getRegistrationNumber(), car);
        return car;

    }

    @Override
    public Car read(String str) {

        return carCode.get(str);

    }

    @Override
    public Car update(Car car) {

        carCode.replace(car.getRegistrationNumber(), car);
        return carCode.get(car.getRegistrationNumber());

    }

    @Override
    public void delete(String str) {

        carCode.remove(str);

    }

}

 */
