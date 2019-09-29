package c.domain.vehicle;

import java.util.Objects;

public class Car extends Vehicle {

    private String bodyStyle;

    public Car(){}

    private Car(CarBuilder builder){

        super(builder);
        this.bodyStyle = builder.bodyStyle;

    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public static class CarBuilder extends Vehicle.Builder{

        private String bodyStyle;

        public CarBuilder(){

            super();

        }

        public CarBuilder bodyStyle(String bodyStyle){

            this.bodyStyle = bodyStyle;
            return this;

        }

        public CarBuilder copy(Car car){

            this.manufacturer(car.getManufacturer());
            this.registrationNumber(car.getRegistrationNumber());
            this.lastServiceDate(car.getLastServiceDate());
            this.modelYear(car.getModelYear());
            this.vinNum(car.getVinNum());
            this.engineCapacity(car.getEngineCapacity());
            this.mileage(car.getMileage());
            this.bodyStyle(car.getBodyStyle());
            return this;

        }

        public Vehicle build(){

            return new Car(this);

        }

        @Override
        public String toString() {
            return "CarBuilder{" +
                    "bodyStyle='" + bodyStyle + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CarBuilder that = (CarBuilder) o;
            return bodyStyle.equals(that.bodyStyle);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bodyStyle);
        }
    }
}
