package c.controller.vehicleservice;

import c.domain.vehicleservice.AccidentDamageRepair;
import c.service.vehicleservice.impl.AccidentDamageRepairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/accidentdamagerepair")
public class AccidentDamageRepairController {

    @Autowired
    private AccidentDamageRepairServiceImpl accidentDamageRepairService;


    @PostMapping("/new")
    public AccidentDamageRepair create(@RequestBody AccidentDamageRepair accidentDamageRepair){

        return accidentDamageRepairService.create(accidentDamageRepair);

    }

    @GetMapping(path = "/find/{id}")
    public AccidentDamageRepair findById(@PathVariable int id){

        AccidentDamageRepair adr = accidentDamageRepairService.read(id);
        return adr;

    }

    @PutMapping("/update")
    public void update(@RequestBody AccidentDamageRepair accidentDamageRepair){

        accidentDamageRepairService.update(accidentDamageRepair);

    }

    @DeleteMapping(path ="/delete/{id}")
    public void delete(@PathVariable int id){

        accidentDamageRepairService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<AccidentDamageRepair> getAll(){

        return accidentDamageRepairService.getAll();

    }

}
