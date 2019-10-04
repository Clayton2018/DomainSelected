package c.service.workshop.impl;

import c.domain.workshop.Equipment;
import c.repositories.workshop.EquipmentRepository;
import c.repositories.workshop.impl.EquipmentRepositoryImpl;
import c.service.workshop.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("EquipmentServiceImpl")
public class EquipmentServiceImpl implements EquipmentService {

    private EquipmentServiceImpl service = null;
    @Autowired
    private EquipmentRepository repository;

    public EquipmentServiceImpl() {

        this.repository = EquipmentRepositoryImpl.getEquipmentRepo();

    }

    public EquipmentServiceImpl getService() {

        if (service == null){

            return new EquipmentServiceImpl();

        }

        return service;

    }

    @Override
    public Set<Equipment> getAll() {
        return repository.getAll();
    }

    @Override
    public Equipment create(Equipment equipment) {
        return repository.create(equipment);
    }

    @Override
    public Equipment read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Equipment update(Equipment equipment) {
        return repository.update(equipment);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
