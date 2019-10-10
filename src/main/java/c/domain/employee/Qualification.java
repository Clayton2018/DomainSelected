package c.domain.employee;

//import javafx.util.Builder;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Qualification {


    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private int qualificationID;
    private String qualificationName;
    private String instituteName;
    private String qualificationDuration;

    public Qualification(){

    }

    public Qualification(Builder builder){

        this.qualificationID = builder.qualificationID;
        this.qualificationName = builder.qualificationName;
        this.instituteName = builder.instituteName;
        this.qualificationDuration = builder.qualificationDuration;

    }

    public int getQualificationID() {
        return qualificationID;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public String getQualificationDuration() {
        return qualificationDuration;
    }


    public static class Builder{

        private int qualificationID;
        private String qualificationName;
        private String instituteName;
        private String qualificationDuration;


        public Builder qualificationID(int qualificationID){

            this.qualificationID = qualificationID;
            return this;

        }

        public Builder qualificationName(String qualificationName){

            this.qualificationName = qualificationName;
            return this;

        }

        public Builder instituteName(String instituteName){

            this.instituteName = instituteName;
            return this;

        }

        public Builder qualificationDuration(String qualificationDuration){

            this.qualificationDuration = qualificationDuration;
            return this;

        }

        public Builder copy(Qualification qualification){

            this.qualificationID(qualification.getQualificationID());
            this.qualificationName(qualification.getQualificationName());
            this.qualificationDuration(qualification.getQualificationDuration());
            this.instituteName(qualification.getInstituteName());
            return this;

        }

        public Qualification build(){

            return new Qualification(this);

        }

        @Override
        public String toString(){

            return "Qualification\n" +
                    "QualificationID: " + qualificationID
                    + "\nQualification name: " + qualificationName
                    + "\nInstitution: " + instituteName
                    + "\nDuration: " + qualificationDuration;

        }

    }





}
