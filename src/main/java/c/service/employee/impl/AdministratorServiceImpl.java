package c.service.employee.impl;

import c.domain.employee.Administrator;
import c.repositories.employees.AdministratorRepository;
import c.repositories.employees.impl.AdministratorRepositoryImpl;
import c.service.employee.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("AdministratorServiceImpl")
public class AdministratorServiceImpl implements AdministratorService {

    private AdministratorServiceImpl service = null;
    @Autowired
    private AdministratorRepository repository;

    public AdministratorServiceImpl() {

        this.repository = AdministratorRepositoryImpl.getAdminRepo();

    }

    public AdministratorServiceImpl getService(){

        if(service == null){

            return new AdministratorServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Administrator> getAll() {

        return this.repository.getAll();

    }

    @Override
    public Administrator create(Administrator administrator) {
        return this.repository.create(administrator);
    }

    @Override
    public Administrator read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Administrator update(Administrator administrator) {
        return repository.update(administrator);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
