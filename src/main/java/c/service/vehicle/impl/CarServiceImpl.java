package c.service.vehicle.impl;

import c.domain.vehicle.Car;
import c.repositories.vehicle.CarRepository;
import c.repositories.vehicle.impl.CarRepositoryImpl;
import c.service.vehicle.CarService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CarServiceImpl")
public class CarServiceImpl implements CarService {

    private CarServiceImpl service = null;
    private CarRepository repository;

    public CarServiceImpl() {

        this.repository = CarRepositoryImpl.getCarRepo();

    }

    public CarServiceImpl getService() {

        if (service == null){

            return new CarServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Car> getAll() {
        return repository.getAll();
    }

    @Override
    public Car create(Car car) {
        return repository.create(car);
    }

    @Override
    public Car read(String s) {
        return repository.read(s);
    }

    @Override
    public Car update(Car car) {
        return repository.update(car);
    }

    @Override
    public void delete(String s) {

        repository.delete(s);

    }

}
