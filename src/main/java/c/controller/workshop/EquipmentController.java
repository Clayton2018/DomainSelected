package c.controller.workshop;

import c.domain.workshop.Equipment;
import c.service.workshop.impl.EquipmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    @Qualifier("EquipmentServiceImpl")
    private EquipmentServiceImpl equipmentService;


    @PostMapping("/new")
    public Equipment create(@RequestBody Equipment equipment){

        return equipmentService.create(equipment);

    }

    @GetMapping(path = "/find/{id}")
    public Equipment findById(@PathVariable int id){

        Equipment e = equipmentService.read(id);
        return e;

    }

    @PutMapping("/update")
    public void update(@RequestBody Equipment equipment){

        equipmentService.update(equipment);

    }

    @DeleteMapping(path ="/delete/{id}")
    public void delete(@PathVariable int id){

        equipmentService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Equipment> getAll(){

        return equipmentService.getAll();

    }

}
