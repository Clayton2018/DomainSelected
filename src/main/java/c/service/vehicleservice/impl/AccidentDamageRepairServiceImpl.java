package c.service.vehicleservice.impl;

import c.domain.vehicleservice.AccidentDamageRepair;
import c.repositories.vehicleservice.AccidentDamageRepairRepository;
import c.repositories.vehicleservice.impl.AccidentDamageRepairRepositoryImpl;
import c.service.vehicleservice.AccidentDamageRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("AccidentDamageRepairServiceImpl")
public class AccidentDamageRepairServiceImpl implements AccidentDamageRepairService {

    private AccidentDamageRepairServiceImpl service = null;
    @Autowired
    private AccidentDamageRepairRepository repository;

    public AccidentDamageRepairServiceImpl() {

        this.repository = AccidentDamageRepairRepositoryImpl.getAccidentDamageRepairRepo();

    }

    public AccidentDamageRepairServiceImpl getService() {

        if (service == null){

            return new AccidentDamageRepairServiceImpl();

        }
        return service;

    }

    @Override
    public Set<AccidentDamageRepair> getAll() {
        return repository.getAll();
    }

    @Override
    public AccidentDamageRepair create(AccidentDamageRepair accidentDamageRepair) {
        return repository.create(accidentDamageRepair);
    }

    @Override
    public AccidentDamageRepair read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public AccidentDamageRepair update(AccidentDamageRepair accidentDamageRepair) {
        return repository.update(accidentDamageRepair);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
