package c.service.employee.impl;

import c.domain.employee.Panelbeater;
import c.repositories.employees.PanelbeaterRepository;
import c.repositories.employees.impl.PanelbeaterRepositoryImpl;
import c.service.employee.PanelbeaterService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("PanelbeaterServiceImpl")
public class PanelbeaterServiceImpl implements PanelbeaterService {

    private PanelbeaterServiceImpl service = null;
    private PanelbeaterRepository repository;

    public PanelbeaterServiceImpl(){

        this.repository = PanelbeaterRepositoryImpl.getPanelbeaterRepo();

    }

    public PanelbeaterServiceImpl getService(){

        if(service == null){

            service = new PanelbeaterServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Panelbeater> getAll() {

        return repository.getAll();

    }

    @Override
    public Panelbeater create(Panelbeater panelbeater) {

        return repository.create(panelbeater);

    }

    @Override
    public Panelbeater read(Integer integer) {

        return repository.read(integer);

    }

    @Override
    public Panelbeater update(Panelbeater panelbeater) {

        return repository.update(panelbeater);

    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
