package c.service.employee.impl;

import c.domain.employee.Cleaner;
import c.repositories.employees.CleanerRepository;
import c.service.employee.CleanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("CleanerServiceImpl")
public class CleanerServiceImpl implements CleanerService {


    private CleanerServiceImpl service = null;
    @Autowired
    private CleanerRepository repository;

    public CleanerServiceImpl(){

        //this.repository = CleanerRepositoryImpl.getCleanerRepo();

    }

    public CleanerServiceImpl getService(){

        if(service == null){

            service = new CleanerServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Cleaner> getAll() {

        List<Cleaner> cleanerList = (List<Cleaner>) repository.findAll();
        return new HashSet<>(cleanerList);
    }

    @Override
    public Cleaner create(Cleaner cleaner) {
        return repository.save(cleaner);
    }

    @Override
    public Cleaner read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Cleaner update(Cleaner cleaner) {
        return repository.save(cleaner);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
