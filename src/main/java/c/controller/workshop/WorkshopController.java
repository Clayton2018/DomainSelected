package c.controller.workshop;

import c.domain.workshop.Workshop;
import c.service.workshop.impl.WorkshopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/workshop")
public class WorkshopController {

    @Autowired
    @Qualifier("WorkshopServiceImpl")
    private WorkshopServiceImpl workshopService;

    @PostMapping("/new")
    public Workshop create(@RequestBody Workshop workshop){

        return workshopService.create(workshop);

    }

    @GetMapping(path = "/find/{id}")
    public Workshop findById(@PathVariable String id){

        Workshop ws = workshopService.read(id);
        return ws;

    }

    @PutMapping("/update")
    public void update(@RequestBody Workshop workshop){

        workshopService.update(workshop);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        workshopService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Workshop> getAll(){

        return  workshopService.getAll();

    }

}
