package c.repositories.vehicleservice;

import c.domain.vehicleservice.AccidentDamageRepair;
import c.repositories.Repository;

import java.util.Set;

public interface AccidentDamageRepairRepository extends Repository<AccidentDamageRepair, Integer> {

    Set<AccidentDamageRepair>getAll();

}
