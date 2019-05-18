package c.controller.employee;
import c.domain.employee.Technician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/technician")
public class TechnicianController {


    @Autowired
    private TechnicianServiceImpl technicianService;


    @PostMapping("/new")
    public Technician create(@RequestBody Technician tech){

        return technicianService.create(tech);

    }

    @GetMapping(path = "/find/{id}")
    public Technician findById(@PathVariable int id){

        Technician technician = technicianService.read(id);
        return technician;

    }

    @PutMapping("/update")
    public void update(RequestBody Technician tech){

        technicianService.update(tech);

    }

    @DeleteMapping(path ="/delete/{id}")
    public void delete(@PathVariable int id){

        technicianService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Technician> getAll(){

        return technicianService.getAll();

    }

}
