package c.service.workshop;

import c.domain.workshop.Equipment;
import c.service.Service;

import java.util.Set;

public interface EquipmentService extends Service<Equipment, Integer>{

    Set<Equipment>getAll();

}
