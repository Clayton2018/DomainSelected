package c.service.employee.impl;

import c.domain.employee.Driver;
import c.repositories.employees.DriverRepository;
import c.service.employee.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("DriverServiceImpl")
public class DriverServiceImpl implements DriverService {

    private DriverServiceImpl service = null;
    @Autowired
    private DriverRepository repository;

    public DriverServiceImpl(){

        //this.repository = DriverRepositoryImpl.getDriverRepo();

    }

    public DriverServiceImpl getService(){

        if(service == null){

            service = new DriverServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Driver> getAll() {

        List<Driver> driverList = (List<Driver>) repository.findAll();
        return new HashSet<>(driverList);

    }

    @Override
    public Driver create(Driver driver) {
        return repository.save(driver);
    }

    @Override
    public Driver read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Driver update(Driver driver) {
        return repository.save(driver);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
