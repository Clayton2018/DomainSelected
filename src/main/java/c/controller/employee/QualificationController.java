package c.controller.employee;

import c.domain.employee.Qualification;
import c.service.employee.impl.QualificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/qualification")
public class QualificationController {

    @Autowired
    private QualificationServiceImpl qualificationService;


    @PostMapping("/new")
    public Qualification create(@RequestBody Qualification qualification){

        return qualificationService.create(qualification);

    }

    @GetMapping(path = "/find/{id}")
    public Qualification findById(@PathVariable int id){

        Qualification qual = qualificationService.read(id);
        return qual;

    }

    @PutMapping("/update")
    public void update(@RequestBody Qualification qualification){

        qualificationService.update(qualification);

    }

    @DeleteMapping(path ="/delete/{id}")
    public void delete(@PathVariable int id){

        qualificationService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Qualification> getAll(){

        return qualificationService.getAll();

    }

}
