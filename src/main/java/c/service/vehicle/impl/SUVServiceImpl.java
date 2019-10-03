package c.service.vehicle.impl;

import c.domain.vehicle.Suv;
import c.repositories.vehicle.SUVRepository;
import c.repositories.vehicle.impl.SUVRepositoryImpl;
import c.service.vehicle.SUVService;

import java.util.Set;

public class SUVServiceImpl implements SUVService {

    private SUVServiceImpl service = null;
    private SUVRepository repository;

    public SUVServiceImpl() {

        this.repository = SUVRepositoryImpl.getSuvRepo();

    }

    public SUVServiceImpl getService() {

        if (service == null){

           return new SUVServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Suv> getAll() {
        return repository.getAll();
    }

    @Override
    public Suv create(Suv suv) {
        return repository.create(suv);
    }

    @Override
    public Suv read(String s) {
        return repository.read(s);
    }

    @Override
    public Suv update(Suv suv) {
        return repository.update(suv);
    }

    @Override
    public void delete(String s) {

        repository.delete(s);

    }
}
