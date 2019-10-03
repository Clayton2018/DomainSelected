package c.service.employee.impl;

import c.domain.employee.Qualification;
import c.repositories.employees.QualificationRepository;
import c.repositories.employees.impl.QualificationRepositoryImpl;
import c.service.employee.QualificationService;

import java.util.Set;

public class QualificationServiceImpl implements QualificationService {

    private QualificationServiceImpl service = null;
    private QualificationRepository repository;


    public QualificationServiceImpl() {

        this.repository = QualificationRepositoryImpl.getQualificationRepo();

    }

    public QualificationServiceImpl getService() {

        if (service == null){

            service = new QualificationServiceImpl();

        }
        return service;

    }

    @Override
    public Set<Qualification> getAll() {
        return repository.getAll();
    }

    @Override
    public Qualification create(Qualification qualification) {
        return repository.create(qualification);
    }

    @Override
    public Qualification read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Qualification update(Qualification qualification) {
        return repository.update(qualification);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
