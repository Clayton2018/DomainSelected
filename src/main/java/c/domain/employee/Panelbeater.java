package c.domain.employee;

import javax.persistence.Entity;

@Entity
public class Panelbeater extends Employee {

    private String type;

    public Panelbeater(){


    }

    private Panelbeater(PanelbeaterBuilder builder){

        super(builder);
        this.type = builder.type;

    }

    public String getType() {
        return type;
    }

    public static class PanelbeaterBuilder extends Employee.Builder{

        private String type;

        public PanelbeaterBuilder(){

            super();

        }

        public PanelbeaterBuilder type(String type){

            this.type = type;
            return this;

        }

        public PanelbeaterBuilder copy(Panelbeater panelbeater){

            this.empID(panelbeater.getEmpID());
            this.empName(panelbeater.getEmpName());
            this.empSurname(panelbeater.getEmpSurname());
            this.empJobTitle(panelbeater.getEmpJobTitle());
            this.empAddress(panelbeater.getEmpAddress());
            this.employmentDate(panelbeater.getEmploymentDate());
            this.empTel(panelbeater.getEmpTel());
            this.type(panelbeater.getType());
            return this;

        }

       // @Override
        public Employee build(){

            return new Panelbeater(this);

        }

        @Override
        public String toString(){

            return "Panelbeater\n" + "Description: "
                    + type + "\n" + super.toString();

        }

    }

}
