package c.domain.employee;

public class Administrator extends Employee {

    private String type;

    public Administrator(){

    }

    private Administrator(AdminBuilder builder){

        super(builder);
        this.type = builder.type;

    }

    public static class AdminBuilder extends Employee.Builder{

        private String type;

        public AdminBuilder(){

            super();

        }

        public AdminBuilder type(String type){

            this.type = type;
            return this;

        }

        @Override
        public Employee build(){

            return new Administrator(this);

        }

        @Override
        public String toString(){

            return "AdminBuilder{" + "type: "
                    + type + "\n" + ""
                    + super.toString();

        }

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AdminBuilder that = (AdminBuilder) o;

            return type != null ? type.equals(that.type): that.type == null;

        }

    }

}
