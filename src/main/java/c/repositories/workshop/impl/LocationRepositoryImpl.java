package c.repositories.workshop.impl;

import c.domain.workshop.Location;
import c.repositories.workshop.LocationRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LocationRepositoryImpl implements LocationRepository {

    private static LocationRepositoryImpl locationRepo = null;
    private Map<Integer, Location> locationCode;

    public LocationRepositoryImpl() {

        locationCode = new HashMap<>();

    }

    public static LocationRepositoryImpl getLocationRepo() {

        if (locationRepo == null){

            return new LocationRepositoryImpl();

        }

        return locationRepo;

    }

    @Override
    public Set<Location> getAll() {
        return new HashSet<>(locationCode.values());
    }

    @Override
    public Location create(Location location) {

        locationCode.put(location.getLocationID(), location);
        return location;

    }

    @Override
    public Location read(Integer integer) {

        return locationCode.get(integer);
    }

    @Override
    public Location update(Location location) {

        locationCode.replace(location.getLocationID(), location);
        return locationCode.get(location.getLocationID());

    }

    @Override
    public void delete(Integer integer) {

        locationCode.remove(integer);

    }
}
