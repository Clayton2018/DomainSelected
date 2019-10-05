/*package c.repositories.vehicleservice.impl;

import c.domain.vehicleservice.AccidentDamageRepair;
import c.repositories.vehicleservice.AccidentDamageRepairRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class AccidentDamageRepairRepositoryImpl implements AccidentDamageRepairRepository {

    private static AccidentDamageRepairRepositoryImpl accidentDamageRepairRepo = null;
    private Map<Integer, AccidentDamageRepair> accidentDamageRepairCode;

    public AccidentDamageRepairRepositoryImpl() {

        accidentDamageRepairCode = new HashMap<>();

    }

    public static AccidentDamageRepairRepositoryImpl getAccidentDamageRepairRepo() {

        if (accidentDamageRepairRepo == null){

             return new AccidentDamageRepairRepositoryImpl();

        }

        return accidentDamageRepairRepo;

    }

    @Override
    public Set<AccidentDamageRepair> getAll() {
        return new HashSet<>(accidentDamageRepairCode.values());
    }

    @Override
    public AccidentDamageRepair create(AccidentDamageRepair accidentDamageRepair) {

        accidentDamageRepairCode.put(accidentDamageRepair.getAccidentCode(), accidentDamageRepair);
        return accidentDamageRepair;

    }

    @Override
    public AccidentDamageRepair read(Integer integer) {
        return accidentDamageRepairCode.get(integer);
    }

    @Override
    public AccidentDamageRepair update(AccidentDamageRepair accidentDamageRepair) {

        accidentDamageRepairCode.replace(accidentDamageRepair.getAccidentCode(), accidentDamageRepair);
        return accidentDamageRepairCode.get(accidentDamageRepair.getAccidentCode());

    }

    @Override
    public void delete(Integer integer) {

        accidentDamageRepairCode.remove(integer);

    }
}

 */
