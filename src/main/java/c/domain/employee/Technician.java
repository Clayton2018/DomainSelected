package c.domain.employee;

import c.domain.vehicle.Vehicle;

import java.util.List;

public class Technician extends Employee{

  private String specialization;
  private List<Vehicle> vehicles;

  public Technician(){

  }

  private Technician(TechnicianBuilder builder){

    super(builder);
    this.specialization = builder.specialization;
    this.vehicles = builder.vehicles;


  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public static class TechnicianBuilder extends Employee.Builder{

    private String specialization;
    private List<Vehicle> vehicles;

    public TechnicianBuilder(){

      super();

    }

    public TechnicianBuilder specialization(String specialization){

      this.specialization = specialization;
      return this;

    }

    public TechnicianBuilder vehicles(List<Vehicle> vehicles){

      this.vehicles = vehicles;
      return this;

    }

    @Override
    public Employee build(){

      return new Technician(this);

    }

    @Override
    public String toString(){

      return "TechnicianBuilder{" + "specialization: "
              + specialization + "\n" + "Vehicles{"
              + vehicles + super.toString();

    }

    @Override
    public boolean equals(Object o) {

      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      TechnicianBuilder that = (TechnicianBuilder) o;

      if(specialization != null ? !specialization.equals(that.specialization) : that.specialization != null)
        return false;
      return vehicles != null ? vehicles.equals(that.vehicles): that.vehicles == null;

    }

    @Override
    public int hashCode(){

      int result = specialization != null ? specialization.hashCode() : 0;
      result = 20 * result + (vehicles != null ? vehicles.hashCode(): 0);
      return result;

    }
  }


}
