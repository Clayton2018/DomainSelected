package c.service.workshop.impl;

import c.domain.workshop.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("LocationServiceImpl")
public class LocationServiceImpl implements LocationService {

    private LocationServiceImpl service = null;
    @Autowired
    private LocationRepository repository;

    public LocationServiceImpl() {

        //this.repository = LocationRepositoryImpl.getLocationRepo();

    }

    public LocationServiceImpl getService() {

        if (service == null){

            return new LocationServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Location> getAll() {

        List<Location> locationList = (List<Location>) repository.findAll();
        return new HashSet<>(locationList);

    }

    @Override
    public Location create(Location location) {
        return repository.save(location);
    }

    @Override
    public Location read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Location update(Location location) {
        return repository.save(location);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
