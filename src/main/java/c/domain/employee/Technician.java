package c.domain.employee;

import c.domain.vehicle.Vehicle;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Technician extends Employee{

  private String specialization;

  public Technician(){

  }

  private Technician(TechnicianBuilder builder){

    super(builder);
    this.specialization = builder.specialization;

  }

  public String getSpecialization() {
    return specialization;
  }

  public static class TechnicianBuilder extends Employee.Builder{

    private String specialization;

    public TechnicianBuilder(){

      super();

    }

    public TechnicianBuilder specialization(String specialization){

      this.specialization = specialization;
      return this;

    }

    public TechnicianBuilder copy(Technician technician){

      this.empID(technician.getEmpID());
      this.empName(technician.getEmpName());
      this.empSurname(technician.getEmpSurname());
      this.empJobTitle(technician.getEmpJobTitle());
      this.empAddress(technician.getEmpAddress());
      this.employmentDate(technician.getEmploymentDate());
      this.empTel(technician.getEmpTel());
      this.specialization(technician.getSpecialization());
      return this;

    }

    @Override
    public Employee build(){

      return new Technician(this);

    }

    @Override
    public String toString(){

      return "TechnicianBuilder{" + "specialization: "
              + specialization + "\n" + super.toString();

    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof TechnicianBuilder)) return false;
      TechnicianBuilder that = (TechnicianBuilder) o;
      return Objects.equals(specialization, that.specialization);
    }

    @Override
    public int hashCode() {
      return Objects.hash(specialization);
    }

  }


}
