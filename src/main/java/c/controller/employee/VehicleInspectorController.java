package c.controller.employee;

import c.domain.employee.VehicleInspector;
import c.service.employee.impl.VehicleInspectorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/vehicleinspector")
@CrossOrigin(origins="http://localhost:4200")
public class VehicleInspectorController {

    @Autowired
    @Qualifier("VehicleInspectorServiceImpl")
    private VehicleInspectorServiceImpl service;

    @PostMapping("/new")
    public VehicleInspector create(@RequestBody VehicleInspector vehicleInspector){

        return service.create(vehicleInspector);

    }

    @GetMapping(path = "/find/{id}")
    public VehicleInspector findById(@PathVariable int id){

        VehicleInspector vI = service.read(id);
        return vI;

    }

    @PutMapping("/update")
    public void update(@RequestBody VehicleInspector vehicleInspector){

        service.update(vehicleInspector);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable int id){

        service.delete(id);

    }

    @GetMapping("/getAll")
    public Set<VehicleInspector> getAll(){

        return service.getAll();

    }

}
