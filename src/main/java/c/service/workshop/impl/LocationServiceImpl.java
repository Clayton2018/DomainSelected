package c.service.workshop.impl;

import c.domain.workshop.Location;
import c.repositories.workshop.LocationRepository;
import c.repositories.workshop.impl.LocationRepositoryImpl;
import c.service.workshop.LocationService;

import java.util.Set;

public class LocationServiceImpl implements LocationService {

    private LocationServiceImpl service = null;
    private LocationRepository repository;

    public LocationServiceImpl() {

        this.repository = LocationRepositoryImpl.getLocationRepo();

    }

    public LocationServiceImpl getService() {

        if (service == null){

            return new LocationServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Location> getAll() {
        return repository.getAll();
    }

    @Override
    public Location create(Location location) {
        return repository.create(location);
    }

    @Override
    public Location read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Location update(Location location) {
        return repository.update(location);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
