package c.service.workshop.impl;

import c.domain.workshop.Workshop;
import c.repositories.workshop.WorkshopRepository;
import c.repositories.workshop.impl.WorkshopRepositoryImpl;
import c.service.workshop.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("WorkshopServiceImpl")
public class WorkshopServiceImpl implements WorkshopService {

    private WorkshopServiceImpl service = null;
    @Autowired
    private WorkshopRepository repository;

    public WorkshopServiceImpl() {

        this.repository = WorkshopRepositoryImpl.getWorkshopRepo();

    }

    public WorkshopServiceImpl getService() {

        if (service == null){

            return new WorkshopServiceImpl();

        }
        return service;

    }

    @Override
    public Set<Workshop> getAll() {
        return repository.getAll();
    }

    @Override
    public Workshop create(Workshop workshop) {
        return repository.create(workshop);
    }

    @Override
    public Workshop read(String s) {
        return repository.read(s);
    }

    @Override
    public Workshop update(Workshop workshop) {
        return repository.update(workshop);
    }

    @Override
    public void delete(String s) {

        repository.delete(s);

    }
}
