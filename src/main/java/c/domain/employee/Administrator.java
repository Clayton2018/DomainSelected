package c.domain.employee;

import javax.persistence.Entity;

@Entity
public class Administrator extends Employee {

    private String adminType;

    public Administrator(){

    }

    private Administrator(AdminBuilder builder){

        super(builder);
        this.adminType = builder.adminType;

    }

    public static class AdminBuilder extends Employee.Builder{

        private String adminType;

        public AdminBuilder(){

            super();

        }

        public AdminBuilder type(String adminType){

            this.adminType = adminType;
            return this;

        }

        @Override
        public Employee build(){

            return new Administrator(this);

        }

        @Override
        public String toString(){

            return "AdminBuilder{" + "type: "
                    + adminType + "\n" + ""
                    + super.toString();

        }

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AdminBuilder that = (AdminBuilder) o;

            return adminType != null ? adminType.equals(that.adminType): that.adminType == null;

        }

    }

}
