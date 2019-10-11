package c.domain.employee;

//import javafx.util.Builder;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Qualification {


    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "qualification_id" , nullable = false, columnDefinition = "VARCHAR(25)")
    private String qualificationID;
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

    public String getQualificationID() {
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

        private String qualificationID;
        private String qualificationName;
        private String instituteName;
        private String qualificationDuration;


        public Builder qualificationID(String qualificationID){

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return qualificationID.equals(builder.qualificationID) &&
                    Objects.equals(qualificationName, builder.qualificationName) &&
                    Objects.equals(instituteName, builder.instituteName) &&
                    Objects.equals(qualificationDuration, builder.qualificationDuration);
        }

        @Override
        public int hashCode() {
            return Objects.hash(qualificationID, qualificationName, instituteName, qualificationDuration);
        }
    }





}
