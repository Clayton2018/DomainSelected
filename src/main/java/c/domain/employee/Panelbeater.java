package c.domain.employee;

public class Panelbeater extends Employee {

    private String type;

    public Panelbeater(){


    }

    private Panelbeater(PanelbeaterBuilder builder){

        super(builder);
        this.type = builder.type;

    }

    public static class PanelbeaterBuilder extends Employee.Builder{

        private String type;

        public PanelbeaterBuilder type(String type){

            this.type = type;
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
