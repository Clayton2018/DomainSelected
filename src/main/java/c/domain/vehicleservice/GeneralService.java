package c.domain.vehicleservice;

import java.util.Objects;

public class GeneralService extends VehicleService {

    private String generalServiceType;

    public GeneralService() {

    }

    private GeneralService(GeneralServiceBuilder builder) {

        super(builder);
        this.generalServiceType = builder.generalServiceType;

    }//end GSB constructor

    public String getGeneralServiceType() {
        return generalServiceType;
    }

    public static class GeneralServiceBuilder extends VehicleService.VehicleServiceBuilder {

        private String generalServiceType;

        public GeneralServiceBuilder() {

            super();

        }

        public GeneralServiceBuilder generalServiceType(String generalServiceType){

            this.generalServiceType = generalServiceType;
            return this;

        }

        @Override
        public VehicleService build(){

            return new GeneralService(this);

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof GeneralServiceBuilder)) return false;
            if (!super.equals(o)) return false;
            GeneralServiceBuilder that = (GeneralServiceBuilder) o;
            return Objects.equals(generalServiceType, that.generalServiceType);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), generalServiceType);
        }

        @Override
        public String toString() {
            return "GeneralServiceBuilder{" +
                    "generalServiceType='" + generalServiceType + '\'' +
                    '}' + super.toString();
        }


    }//end GSB inner class

}//end class GeneralService
