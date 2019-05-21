package c.domain.vehicle;

import java.util.Objects;

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

        public SuvBuilder bodyStyle(String bodyStyle){

            this.bodyStyle = bodyStyle;
            return this;

        }

        public Vehicle build(){

            return new Suv(this);

        }

        @Override
        public String toString() {
            return "SuvBuilder{" +
                    "bodyStyle='" + bodyStyle + '\'' +
                    '}';
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
