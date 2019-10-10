package c.domain.vehicle;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Suv extends Vehicle{

    private String bodyStyle;


    public Suv(){

    }

    private Suv(SuvBuilder builder){

        super(builder);
        this.bodyStyle = builder.bodyStyle;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public static class SuvBuilder extends Vehicle.Builder{

        private String bodyStyle;

        public SuvBuilder(){

            super();

        }

        public SuvBuilder bodyStyle(String bodyStyle){

            this.bodyStyle = bodyStyle;
            return this;

        }

        public SuvBuilder copy(Suv suv){

            this.manufacturer(suv.getManufacturer());
            this.regNum(suv.getRegNum());
            this.lastServiceDate(suv.getLastServiceDate());
            this.modelYear(suv.getModelYear());
            this.vinNum(suv.getVinNum());
            this.engineCapacity(suv.getEngineCapacity());
            this.mileage(suv.getMileage());
            this.bodyStyle(suv.getBodyStyle());
            return this;

        }

        public Vehicle build(){

            return new Suv(this);

        }

        @Override
        public String toString() {
            return "SuvBuilder{" +
                    "bodyStyle='" + bodyStyle + '\'' +
                    super.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SuvBuilder that = (SuvBuilder) o;
            return Objects.equals(bodyStyle, that.bodyStyle);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bodyStyle);
        }
    }

}
