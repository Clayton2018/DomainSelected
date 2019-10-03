package c.service.vehicleservice;

import c.domain.vehicleservice.AccidentDamageRepair;
import c.service.Service;

import java.util.Set;

public interface AccidentDamageRepairService extends Service<AccidentDamageRepair, Integer> {

    Set<AccidentDamageRepair>getAll();

}
