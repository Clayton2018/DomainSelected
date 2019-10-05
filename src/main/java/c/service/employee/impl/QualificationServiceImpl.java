package c.service.employee.impl;

import c.domain.employee.Qualification;
import c.repositories.employees.QualificationRepository;
import c.service.employee.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("QualificationServiceImpl")
public class QualificationServiceImpl implements QualificationService {

    private QualificationServiceImpl service = null;
    @Autowired
    private QualificationRepository repository;


    public QualificationServiceImpl() {

        //this.repository = QualificationRepositoryImpl.getQualificationRepo();

    }

    public QualificationServiceImpl getService() {

        if (service == null){

            service = new QualificationServiceImpl();

        }
        return service;

    }

    @Override
    public Set<Qualification> getAll() {

        List<Qualification> qualificationList = (List<Qualification>) repository.findAll();
        return new HashSet<>(qualificationList);
    }

    @Override
    public Qualification create(Qualification qualification) {
        return repository.save(qualification);
    }

    @Override
    public Qualification read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Qualification update(Qualification qualification) {
        return repository.save(qualification);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
