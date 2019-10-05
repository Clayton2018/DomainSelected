/*package c.repositories.employees.impl;

import c.domain.employee.Driver;
import c.repositories.employees.DriverRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class DriverRepositoryImpl implements DriverRepository {

    private static DriverRepositoryImpl driverRepo = null;
    private Map<Integer, Driver> driverEmp;

    public DriverRepositoryImpl(){

        driverEmp = new HashMap<>();

    }

    public static DriverRepositoryImpl getDriverRepo(){

        if(driverRepo == null){

            return new DriverRepositoryImpl();

        }

        return driverRepo;

    }

    @Override
    public Set<Driver> getAll() {
        return new HashSet<>(driverEmp.values());
    }

    @Override
    public Driver create(Driver driver) {

        driverEmp.put(driver.getEmpID(), driver);
        return driver;
    }

    @Override
    public Driver read(Integer integer) {

        return driverEmp.get(integer);
    }

    @Override
    public Driver update(Driver driver) {

        driverEmp.replace(driver.getEmpID(), driver);
        return driverEmp.get(driver.getEmpID());
    }

    @Override
    public void delete(Integer integer) {

        driverEmp.remove(integer);

    }

}

 */
