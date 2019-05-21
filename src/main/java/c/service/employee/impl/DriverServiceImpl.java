package c.service.employee.impl;

import c.domain.employee.Driver;
import c.repositories.employees.DriverRepository;
import c.service.employee.DriverService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("DriverServiceImpl")
public class DriverServiceImpl implements DriverService {

    private DriverServiceImpl service = null;
    private DriverRepository repository;

    public DriverServiceImpl(){

        this.repository = DriverServiceImpl.getDriverRepository();

    }

    public DriverServiceImpl getService(){

        if(service == null){

            service = new DriverServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Driver> getAll() {

        return repository.getAll();

    }

    @Override
    public Driver create(Driver driver) {
        return repository.create(driver);
    }

    @Override
    public Driver read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Driver update(Driver driver) {
        return repository.update(driver);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
