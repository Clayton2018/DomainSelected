package c.service.employee.impl;

import c.domain.employee.Mechanic;
import c.repositories.employees.MechanicRepository;
import c.service.employee.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("MechanicServiceImpl")
public class MechanicServiceImpl implements MechanicService {


    private MechanicServiceImpl service = null;
    @Autowired
    private MechanicRepository repository;

    public MechanicServiceImpl(){

        //this.repository = MechanicRepositoryImpl.getMechanicRepo();

    }

    public MechanicServiceImpl getService(){

        if(service == null){

            service = new MechanicServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Mechanic> getAll() {

        List<Mechanic> mechanicList = (List<Mechanic>) repository.findAll();
        return new HashSet<>(mechanicList);
    }

    @Override
    public Mechanic create(Mechanic mechanic) {
        return repository.save(mechanic);
    }

    @Override
    public Mechanic read(Integer integer) {

        return repository.findById(integer).orElse(null);

    }

    @Override
    public Mechanic update(Mechanic mechanic) {
        return repository.save(mechanic);
    }

    @Override
    public void delete(Integer integer) {

         repository.deleteById(integer);

    }
}
