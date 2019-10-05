package c.service.vehicle.impl;

import c.domain.vehicle.Car;
import c.repositories.vehicle.CarRepository;
import c.service.vehicle.CarService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("CarServiceImpl")
public class CarServiceImpl implements CarService {

    private CarServiceImpl service = null;
    private CarRepository repository;

    public CarServiceImpl() {

        //this.repository = CarRepositoryImpl.getCarRepo();

    }

    public CarServiceImpl getService() {

        if (service == null){

            return new CarServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Car> getAll() {

        List<Car> carList = (List<Car>) repository.findAll();
        return new HashSet<>(carList);
    }

    @Override
    public Car create(Car car) {
        return repository.save(car);
    }

    @Override
    public Car read(String s) {
        return repository.findById(s).orElse(null);
    }

    @Override
    public Car update(Car car) {
        return repository.save(car);
    }

    @Override
    public void delete(String s) {

        repository.deleteById(s);

    }

}
