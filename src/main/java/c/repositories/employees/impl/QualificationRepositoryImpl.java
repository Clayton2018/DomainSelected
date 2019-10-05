/*package c.repositories.employees.impl;

import c.domain.employee.Qualification;
import c.repositories.employees.QualificationRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class QualificationRepositoryImpl implements QualificationRepository {

    private static QualificationRepositoryImpl qualificationRepo = null;
    private Map<Integer, Qualification> qualificationCode;

    public QualificationRepositoryImpl(){

        qualificationCode = new HashMap<>();

    }

    public static QualificationRepositoryImpl getQualificationRepo(){

        if(qualificationRepo == null){

            return new QualificationRepositoryImpl();

        }

        return qualificationRepo;

    }

    @Override
    public Set<Qualification> getAll() {
        return new HashSet<>(qualificationCode.values());
    }

    @Override
    public Qualification create(Qualification qualification) {

        qualificationCode.put(qualification.getQualificationID(), qualification);
        return qualification;
    }

    @Override
    public Qualification read(Integer integer) {

        return qualificationCode.get(integer);
    }

    @Override
    public Qualification update(Qualification qualification) {

        qualificationCode.replace(qualification.getQualificationID(), qualification);
        return qualificationCode.get(qualification.getQualificationID());
    }

    @Override
    public void delete(Integer integer) {

        qualificationCode.remove(integer);

    }

}

 */
