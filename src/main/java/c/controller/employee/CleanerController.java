package c.controller.employee;


import c.Factory.employee.CleanerFactory;
import c.domain.employee.Cleaner;
import c.service.employee.impl.CleanerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("cleaner")
public class CleanerController {

    @Autowired
    @Qualifier("CleanerServiceImpl")
    private CleanerServiceImpl service;

    @PostMapping("/new")
    public Cleaner create(@RequestBody Cleaner cleaner){

        return service.create(cleaner);

    }

    @GetMapping(path = "/find/{id}")
    public Cleaner findById(@PathVariable int id){

        Cleaner cleaner = service.read(id);

        return cleaner;
    }

    @PutMapping("/update")
    public void update(@RequestBody Cleaner cleaner){

        service.update(cleaner);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable int id) {

        service.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Cleaner> getAll(){

        return service.getAll();

    }

}




