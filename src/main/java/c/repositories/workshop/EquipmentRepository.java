package c.repositories.workshop;

import c.domain.workshop.Equipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface EquipmentRepository extends CrudRepository<Equipment, Integer> {

    Set<Equipment>getAll();

}
