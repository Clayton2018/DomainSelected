package c.repositories.vehicleservice;

import c.domain.vehicleservice.AccidentDamageRepair;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface AccidentDamageRepairRepository extends CrudRepository<AccidentDamageRepair, Integer> {

    Set<AccidentDamageRepair>getAll();

}
