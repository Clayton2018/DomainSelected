package c.controller.employee;

import c.Factory.employee.DriverFactory;
import c.domain.employee.Driver;
import c.service.employee.impl.DriverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/driver")
public class DriverController {


        @Autowired
        @Qualifier("DriverServiceImpl")
        private DriverServiceImpl service;

        @PostMapping("/new")
        public Driver create(@RequestBody Driver driver){


            driver.setEmpID(1);

            return service.create(driver);

        }

        @GetMapping(path = "/find/{id}")
        public Driver findById(@PathVariable int id){

            Driver driver = service.read(id);

            return driver;
        }

        @PutMapping("/update")
        public void update(@RequestBody Driver driver){

            service.update(driver);

        }

        @DeleteMapping(path = "/delete/{id}")
        public void delete(@PathVariable int id) {

            service.delete(id);

        }

        @GetMapping("/getAll")
        public Set<Driver> getAll(){

            return service.getAll();

        }

    }
