package c.controller.vehicle;

import c.domain.vehicle.Truck;
import c.service.vehicle.impl.TruckServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/truck")
@CrossOrigin(origins="http://localhost:4200")
public class TruckController {

    @Autowired
    @Qualifier("TruckServiceImpl")
    private TruckServiceImpl truckService;

    @PostMapping("/new")
    public Truck create(@RequestBody Truck truck){

        return truckService.create(truck);

    }

    @GetMapping(path = "/find/{id}")
    public Truck findById(@PathVariable String id){

        Truck truckB = truckService.read(id);
        return truckB;

    }

    @PutMapping("/update")
    public void update(@RequestBody Truck truck){

        truckService.update(truck);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        truckService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Truck> getAll(){

        return truckService.getAll();

    }

}
