package c.service.vehicleservice.impl;

import c.domain.vehicleservice.AccidentDamageRepair;
import c.repositories.vehicleservice.AccidentDamageRepairRepository;
import c.service.vehicleservice.AccidentDamageRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("AccidentDamageRepairServiceImpl")
public class AccidentDamageRepairServiceImpl implements AccidentDamageRepairService {

    private AccidentDamageRepairServiceImpl service = null;
    @Autowired
    private AccidentDamageRepairRepository repository;

    public AccidentDamageRepairServiceImpl() {

        //this.repository = AccidentDamageRepairRepositoryImpl.getAccidentDamageRepairRepo();

    }

    public AccidentDamageRepairServiceImpl getService() {

        if (service == null){

            return new AccidentDamageRepairServiceImpl();

        }
        return service;

    }

    @Override
    public Set<AccidentDamageRepair> getAll() {

        List<AccidentDamageRepair> accidentDamageRepairList = (List<AccidentDamageRepair>) repository.findAll();
        return new HashSet<>(accidentDamageRepairList);
    }

    @Override
    public AccidentDamageRepair create(AccidentDamageRepair accidentDamageRepair) {
        return repository.save(accidentDamageRepair);
    }

    @Override
    public AccidentDamageRepair read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public AccidentDamageRepair update(AccidentDamageRepair accidentDamageRepair) {
        return repository.save(accidentDamageRepair);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
