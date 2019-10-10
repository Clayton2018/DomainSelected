package c.controller.vehicleservice;

import c.domain.vehicleservice.VehicleService;
import c.service.vehicleservice.impl.VehicleServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/vehicleservice")
@CrossOrigin(origins="http://localhost:4200")
public class VehicleServiceController {

    @Autowired
    @Qualifier("VehicleServiceServiceImpl")
    private VehicleServiceServiceImpl vehicleServiceService;


    @PostMapping("/new")
    public VehicleService create(@RequestBody VehicleService vehicleService){

        return vehicleServiceService.create(vehicleService);

    }

    @GetMapping(path = "/find/{id}")
    public VehicleService findById(@PathVariable int id){

        VehicleService vs = vehicleServiceService.read(id);
        return vs;

    }

    @PutMapping("/update")
    public void update(@RequestBody VehicleService vehicleService){

        vehicleServiceService.update(vehicleService);

    }

    @DeleteMapping(path ="/delete/{id}")
    public void delete(@PathVariable int id){

        vehicleServiceService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<VehicleService> getAll(){

        return vehicleServiceService.getAll();

    }
}
