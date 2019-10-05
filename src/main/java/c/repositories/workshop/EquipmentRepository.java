package c.repositories.workshop;

import c.domain.workshop.Equipment;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface EquipmentRepository extends CrudRepository<Equipment, Integer> {

    Set<Equipment>getAll();

}
