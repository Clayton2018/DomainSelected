package c.controller.vehicle;


import c.domain.vehicle.Car;
import c.service.vehicle.impl.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @PostMapping("/new")
    public Car create(@RequestBody Car car){

        return carService.create(car);

    }

    @GetMapping(path = "/find/{id}")
    public Car findById(@PathVariable String id){

        Car carB = carService.read(id);
        return carB;

    }

    @PutMapping("/update")
    public void update(@RequestBody Car car){

        carService.update(car);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        carService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Car> getAll(){

        return carService.getAll();

    }

}