package c.controller.workshop;

import c.domain.workshop.Location;
import c.service.workshop.impl.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    @Qualifier("LocationServiceImpl")
    private LocationServiceImpl locationService;


    @PostMapping("/new")
    public Location create(@RequestBody Location location){

        return locationService.create(location);

    }

    @GetMapping(path = "/find/{id}")
    public Location findById(@PathVariable int id){

        Location l = locationService.read(id);
        return l;

    }

    @PutMapping("/update")
    public void update(@RequestBody Location location){

        locationService.update(location);

    }

    @DeleteMapping(path ="/delete/{id}")
    public void delete(@PathVariable int id){

        locationService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Location> getAll(){

        return locationService.getAll();

    }
}
