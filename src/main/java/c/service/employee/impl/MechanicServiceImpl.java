package c.service.employee.impl;

import c.domain.employee.Mechanic;
import c.repositories.employees.MechanicRepository;
import c.service.employee.MechanicService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("MechanicServiceImpl")
public class MechanicServiceImpl implements MechanicService {


    private MechanicServiceImpl service = null;
    private MechanicRepository repository;

    public MechanicServiceImpl(){

        this.repository = MechanicServiceImpl.getMechanicRepository();

    }

    public MechanicServiceImpl getService(){

        if(service == null){

            service = new MechanicServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Mechanic> getAll() {
        return null;
    }

    @Override
    public Mechanic create(Mechanic mechanic) {
        return repository.create(mechanic);
    }

    @Override
    public Mechanic read(Integer integer) {

        return repository.read(integer);

    }

    @Override
    public Mechanic update(Mechanic mechanic) {
        return repository.update(mechanic);
    }

    @Override
    public void delete(Integer integer) {

         repository.delete(integer);

    }
}
