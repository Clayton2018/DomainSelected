package c.controller.employee;

import c.domain.employee.Mechanic;
import c.service.employee.impl.MechanicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {

    @Autowired
    @Qualifier("MechanicServiceImpl")
    private MechanicServiceImpl mechanicService;

    @PostMapping("/new")
    public Mechanic create(@RequestBody Mechanic mechanic){

        return mechanicService.create(mechanic);

    }

    @GetMapping(path = "/find/{id}")
    public Mechanic findById(@PathVariable int id){

        Mechanic m = mechanicService.read(id);
        return m;

    }

    @PutMapping("/update")
    public void update(@RequestBody Mechanic mechanic){

        mechanicService.update(mechanic);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable int id){

        mechanicService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Mechanic> getAll(){

        return mechanicService.getAll();

    }


}



