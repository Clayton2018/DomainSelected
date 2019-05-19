package c.domain.employee;

import c.domain.vehicle.Vehicle;

import java.util.List;

public class Mechanic extends Employee {


    private String duties;
    private List<Vehicle> vehicles;


    public Mechanic(){

    }

    public Mechanic(MechanicBuilder builder){

        super(builder);
        this.duties = builder.duties;
        this.vehicles = builder.vehicles;


    }


    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


}
