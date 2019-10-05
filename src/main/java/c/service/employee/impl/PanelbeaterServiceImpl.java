package c.service.employee.impl;

import c.domain.employee.Panelbeater;
import c.repositories.employees.PanelbeaterRepository;
import c.service.employee.PanelbeaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("PanelbeaterServiceImpl")
public class PanelbeaterServiceImpl implements PanelbeaterService {

    private PanelbeaterServiceImpl service = null;
    @Autowired
    private PanelbeaterRepository repository;

    public PanelbeaterServiceImpl(){

        //this.repository = PanelbeaterRepositoryImpl.getPanelbeaterRepo();

    }

    public PanelbeaterServiceImpl getService(){

        if(service == null){

            service = new PanelbeaterServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Panelbeater> getAll() {

        List<Panelbeater> panelbeaterList = (List<Panelbeater>) repository.findAll();
        return new HashSet<>(panelbeaterList);

    }

    @Override
    public Panelbeater create(Panelbeater panelbeater) {

        return repository.save(panelbeater);

    }

    @Override
    public Panelbeater read(Integer integer) {

        return repository.findById(integer).orElse(null);

    }

    @Override
    public Panelbeater update(Panelbeater panelbeater) {

        return repository.save(panelbeater);

    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
