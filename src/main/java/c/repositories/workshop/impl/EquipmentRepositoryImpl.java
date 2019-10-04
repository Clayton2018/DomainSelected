package c.repositories.workshop.impl;

import c.domain.workshop.Equipment;
import c.repositories.workshop.EquipmentRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class EquipmentRepositoryImpl implements EquipmentRepository {

    private static EquipmentRepositoryImpl equipmentRepo = null;
    private Map<Integer, Equipment> equipmentCode;

    public EquipmentRepositoryImpl() {

        equipmentCode = new HashMap<>();

    }

    public static EquipmentRepositoryImpl getEquipmentRepo() {

        if (equipmentRepo == null){

            return new EquipmentRepositoryImpl();

        }

        return equipmentRepo;

    }

    @Override
    public Set<Equipment> getAll() {

        return new HashSet<>(equipmentCode.values());

    }

    @Override
    public Equipment create(Equipment equipment) {

        equipmentCode.put(equipment.getEquipNum(), equipment);
        return equipment;

    }

    @Override
    public Equipment read(Integer integer) {
        return equipmentCode.get(integer);
    }

    @Override
    public Equipment update(Equipment equipment) {

        equipmentCode.replace(equipment.getEquipNum(), equipment);
        return equipmentCode.get(equipment.getEquipNum());

    }

    @Override
    public void delete(Integer integer) {

        equipmentCode.remove(integer);

    }
}
