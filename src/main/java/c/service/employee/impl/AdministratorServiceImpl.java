package c.service.employee.impl;

import c.domain.employee.Administrator;
import c.repositories.employees.AdministratorRepository;
import c.service.employee.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("AdministratorServiceImpl")
public class AdministratorServiceImpl implements AdministratorService {

    private AdministratorServiceImpl service = null;
    @Autowired
    private AdministratorRepository repository;

    public AdministratorServiceImpl() {

        //this.repository = AdministratorRepositoryImpl.getAdminRepo();

    }

    public AdministratorServiceImpl getService(){

        if(service == null){

            return new AdministratorServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Administrator> getAll() {

        List<Administrator> administratorList = (List<Administrator>) repository.findAll();
        return new HashSet<>(administratorList);

    }

    @Override
    public Administrator create(Administrator administrator) {

        return repository.save(administrator);
    }

    @Override
    public Administrator read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Administrator update(Administrator administrator) {
        return repository.save(administrator);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
