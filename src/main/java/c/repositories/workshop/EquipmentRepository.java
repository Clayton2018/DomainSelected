package c.repositories.workshop;

import c.domain.workshop.Equipment;
import c.repositories.Repository;

import java.util.Set;

public interface EquipmentRepository extends Repository<Equipment, Integer> {

    Set<Equipment>getAll();

}
