package c.repositories.vehicleservice;

import c.domain.vehicleservice.AccidentDamageRepair;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AccidentDamageRepairRepository extends CrudRepository<AccidentDamageRepair, Integer> {

    Set<AccidentDamageRepair>getAll();

}
