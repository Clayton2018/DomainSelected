package c.controller.employee;

import c.Factory.employee.AdministratorFactory;
import c.domain.employee.Administrator;
import c.service.employee.impl.AdministratorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {

    @Autowired
    @Qualifier("AdministratorServiceImpl")
    private AdministratorServiceImpl administratorService;

    @PostMapping("/new")
    public Administrator create(@RequestBody Administrator administrator){

        return administratorService.create(administrator);

    }

    @GetMapping(path = "/find/{id}")
    public Administrator findById(@PathVariable int id){

        Administrator a = administratorService.read(id);
        return a;

    }

    @PutMapping("/update")
    public void update(@RequestBody Administrator administrator){

        administratorService.update(administrator);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable int id){

        administratorService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Administrator> getAll(){

        return administratorService.getAll();

    }

}
