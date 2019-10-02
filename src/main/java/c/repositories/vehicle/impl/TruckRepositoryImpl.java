package c.repositories.vehicle.impl;

import c.domain.vehicle.Truck;
import c.repositories.vehicle.TruckRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TruckRepositoryImpl implements TruckRepository {

    private static TruckRepositoryImpl truckRepo = null;
    private Map<String, Truck> truckCode;

    public TruckRepositoryImpl() {

        truckCode = new HashMap<>();

    }

    public static TruckRepositoryImpl getTruckRepo() {

        if(truckRepo == null){

            return new TruckRepositoryImpl();

        }

        return truckRepo;

    }

    @Override
    public Set<Truck> getAll() {
        return new HashSet<>(truckCode.values());
    }

    @Override
    public Truck create(Truck truck) {

        truckCode.put(truck.getRegistrationNumber(), truck);
        return truck;

    }

    @Override
    public Truck read(String str) {

        return truckCode.get(str);

    }

    @Override
    public Truck update(Truck truck) {

        truckCode.replace(truck.getRegistrationNumber(), truck);
        return truckCode.get(truck.getRegistrationNumber());

    }

    @Override
    public void delete(String str) {

        truckCode.remove(str);

    }

}
