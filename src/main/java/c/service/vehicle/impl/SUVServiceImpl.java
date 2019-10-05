package c.service.vehicle.impl;

import c.domain.vehicle.Suv;
import c.repositories.vehicle.SUVRepository;
import c.service.vehicle.SUVService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("SUVServiceImpl")
public class SUVServiceImpl implements SUVService {

    private SUVServiceImpl service = null;
    private SUVRepository repository;

    public SUVServiceImpl() {

        //this.repository = SUVRepositoryImpl.getSuvRepo();

    }

    public SUVServiceImpl getService() {

        if (service == null){

           return new SUVServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Suv> getAll() {

        List<Suv> suvList = (List<Suv>) repository.findAll();
        return new HashSet<>(suvList);

    }

    @Override
    public Suv create(Suv suv) {
        return repository.save(suv);
    }

    @Override
    public Suv read(String s) {
        return repository.findById(s).orElse(null);
    }

    @Override
    public Suv update(Suv suv) {
        return repository.save(suv);
    }

    @Override
    public void delete(String s) {

        repository.deleteById(s);

    }
}
