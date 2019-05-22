package c.controller.employee;

import c.domain.employee.Panelbeater;
import c.domain.employee.Technician;
import c.service.employee.impl.PanelbeaterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/panelbeater")
public class PanelBeaterController {


    @Autowired
    private PanelbeaterServiceImpl panelbeaterService;


    @PostMapping("/new")
    public Panelbeater create(@RequestBody Panelbeater panelB){

        return panelbeaterService.create(panelB);

    }

    @GetMapping(path = "/find/{id}")
    public Panelbeater findById(@PathVariable int id){

        Panelbeater panelbeater = panelbeaterService.read(id);
        return panelbeater;

    }

    @PutMapping("/update")
    public void update(@RequestBody Panelbeater panelB){

        panelbeaterService.update(panelB);

    }

    @DeleteMapping(path ="/delete/{id}")
    public void delete(@PathVariable int id){

        panelbeaterService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Panelbeater> getAll(){

        return panelbeaterService.getAll();

    }


}
