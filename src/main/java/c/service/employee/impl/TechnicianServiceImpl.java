package c.service.employee.impl;

import c.domain.employee.Technician;
import c.repositories.employees.TechnicianRepository;
import c.service.employee.TechnicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("TechnicianServiceImpl")
public class TechnicianServiceImpl implements TechnicianService {


    private TechnicianServiceImpl service = null;
    @Autowired
    private TechnicianRepository repository;

    public TechnicianServiceImpl(){

        //this.repository = TechnicianRepositoryImpl.getTechnicianRepo();

    }

    public TechnicianServiceImpl getService() {

        if(service == null){


            service = new TechnicianServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Technician> getAll() {

        List<Technician> technicianList = (List<Technician>) repository.findAll();
        return new HashSet<>(technicianList);
    }

    @Override
    public Technician create(Technician technician) {
        return repository.save(technician);
    }

    @Override
    public Technician read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Technician update(Technician technician) {
        return repository.save(technician);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
