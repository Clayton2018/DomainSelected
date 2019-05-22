package c.service.employee.impl;

import c.domain.employee.Cleaner;
import c.repositories.employees.CleanerRepository;
import c.repositories.employees.impl.CleanerRepositoryImpl;
import c.service.employee.CleanerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CleanerServiceImpl")
public class CleanerServiceImpl implements CleanerService {


    private CleanerServiceImpl service = null;
    private CleanerRepository repository;

    public CleanerServiceImpl(){

        this.repository = CleanerRepositoryImpl.getCleanerRepo();

    }

    public CleanerServiceImpl getService(){

        if(service == null){

            service = new CleanerServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Cleaner> getAll() {
        return repository.getAll();
    }

    @Override
    public Cleaner create(Cleaner cleaner) {
        return repository.create(cleaner);
    }

    @Override
    public Cleaner read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Cleaner update(Cleaner cleaner) {
        return repository.update(cleaner);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
