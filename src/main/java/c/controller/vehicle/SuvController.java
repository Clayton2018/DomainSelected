package c.controller.vehicle;

import c.domain.vehicle.Suv;
import c.service.vehicle.impl.SUVServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/suv")
@CrossOrigin(origins="http://localhost:4200")
public class SuvController {

    @Autowired
    @Qualifier("SUVServiceImpl")
    private SUVServiceImpl suvService;

    @PostMapping("/new")
    public Suv create(@RequestBody Suv suv){

        return suvService.create(suv);

    }

    @GetMapping(path = "/find/{id}")
    public Suv findById(@PathVariable String id){

        Suv suvB = suvService.read(id);
        return suvB;

    }

    @PutMapping("/update")
    public void update(@RequestBody Suv suv){

        suvService.update(suv);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        suvService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Suv> getAll(){

        return suvService.getAll();

    }

}
