package c.service.vehicle.impl;

import c.domain.vehicle.Truck;
import c.repositories.vehicle.TruckRepository;
import c.repositories.vehicle.impl.TruckRepositoryImpl;
import c.service.vehicle.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("TruckServiceImpl")
public class TruckServiceImpl implements TruckService {

    private TruckServiceImpl service = null;
    @Autowired
    private TruckRepository repository;

    public TruckServiceImpl() {

        this.repository = TruckRepositoryImpl.getTruckRepo();

    }

    public TruckServiceImpl getService() {

        if (service == null){

            return new TruckServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Truck> getAll() {
        return repository.getAll();
    }

    @Override
    public Truck create(Truck truck) {
        return repository.create(truck);
    }

    @Override
    public Truck read(String s) {
        return repository.read(s);
    }

    @Override
    public Truck update(Truck truck) {
        return repository.update(truck);
    }

    @Override
    public void delete(String s) {

        repository.delete(s);

    }
}
