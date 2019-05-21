package c.domain.vehicle;

import java.util.Objects;

public class Truck extends Vehicle {

    private String type;
    private String loadCapacity;

    public Truck(){

    }

    private Truck(TruckBuilder builder){

        super(builder);
        this.type = builder.type;
        this.loadCapacity = builder.loadCapacity;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public static class TruckBuilder extends Vehicle.Builder{

        private String type;
        private String loadCapacity;


        public TruckBuilder type(String type){

            this.type = type;
            return this;

        }

        public TruckBuilder loadCapacity(String loadCap){

            this.loadCapacity = loadCap;
            return this;

        }

        public Vehicle build(){

            return new Truck(this);

        }

        @Override
        public String toString() {
            return "TruckBuilder{" +
                    "type='" + type + '\'' +
                    ", loadCapacity='" + loadCapacity + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TruckBuilder that = (TruckBuilder) o;
            return type.equals(that.type) &&
                    loadCapacity.equals(that.loadCapacity);
        }

        @Override
        public int hashCode() {
            return Objects.hash(type, loadCapacity);
        }
    }


}
