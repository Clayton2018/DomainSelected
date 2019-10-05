package c.service.vehicle.impl;

import c.domain.vehicle.Truck;
import c.repositories.vehicle.TruckRepository;
import c.service.vehicle.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("TruckServiceImpl")
public class TruckServiceImpl implements TruckService {

    private TruckServiceImpl service = null;
    @Autowired
    private TruckRepository repository;

    public TruckServiceImpl() {

       // this.repository = TruckRepositoryImpl.getTruckRepo();

    }

    public TruckServiceImpl getService() {

        if (service == null){

            return new TruckServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Truck> getAll() {

        List<Truck> truckList = (List<Truck>) repository.findAll();
        return new HashSet<>(truckList);

    }

    @Override
    public Truck create(Truck truck) {
        return repository.save(truck);
    }

    @Override
    public Truck read(String s) {
        return repository.findById(s).orElse(null);
    }

    @Override
    public Truck update(Truck truck) {
        return repository.save(truck);
    }

    @Override
    public void delete(String s) {

        repository.deleteById(s);

    }
}
