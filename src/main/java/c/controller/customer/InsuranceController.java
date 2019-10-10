package c.controller.customer;

import c.domain.customer.Insurance;
import c.service.customer.impl.InsuranceServiceImpl;
import c.service.employee.impl.AdministratorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/insurance")
@CrossOrigin(origins="http://localhost:4200")
public class InsuranceController {

    @Autowired
    @Qualifier("InsuranceServiceImpl")
    private InsuranceServiceImpl insuranceService;

    @PostMapping("/new")
    public Insurance create(@RequestBody Insurance insurance){

        return insuranceService.create(insurance);

    }

    @GetMapping(path = "/find/{id}")
    public Insurance findById(@PathVariable int id){

        Insurance in = insuranceService.read(id);
        return in;

    }

    @PutMapping("/update")
    public void update(@RequestBody Insurance insurance){

        insuranceService.update(insurance);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable int id){

        insuranceService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Insurance> getAll(){

        return insuranceService.getAll();

    }


}
