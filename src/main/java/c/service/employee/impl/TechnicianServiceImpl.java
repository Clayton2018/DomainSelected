package c.service.employee.impl;

import c.domain.employee.Technician;
import c.repositories.employees.TechnicianRepository;
import c.repositories.employees.impl.TechnicianRepositoryImpl;
import c.service.employee.TechnicianService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("TechnicianServiceImpl")
public class TechnicianServiceImpl implements TechnicianService {


    private TechnicianServiceImpl service = null;
    private TechnicianRepository repository;

    public TechnicianServiceImpl(){

        this.repository = TechnicianRepositoryImpl.getTechnicianRepo();


    }

    public TechnicianServiceImpl getService() {

        if(service == null){


            service = new TechnicianServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Technician> getAll() {
        return repository.getAll();
    }

    @Override
    public Technician create(Technician technician) {
        return repository.create(technician);
    }

    @Override
    public Technician read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Technician update(Technician technician) {
        return repository.update(technician);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
