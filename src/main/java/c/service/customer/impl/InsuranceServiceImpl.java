package c.service.customer.impl;

import c.domain.customer.Insurance;
import c.repositories.customer.InsuranceRepository;
import c.repositories.customer.impl.InsuranceRepositoryImpl;
import c.service.customer.InsuranceService;

import java.util.Set;

public class InsuranceServiceImpl implements InsuranceService {

    private InsuranceServiceImpl service = null;
    private InsuranceRepository repository;


    public InsuranceServiceImpl() {

        this.repository = InsuranceRepositoryImpl.getInsuranceRepo();

    }

    public InsuranceServiceImpl getService() {

        if (service == null){

            return new InsuranceServiceImpl();

        }

        return service;
    }

    @Override
    public Set<Insurance> getAll() {
        return repository.getAll();
    }

    @Override
    public Insurance create(Insurance insurance) {
        return repository.create(insurance);
    }

    @Override
    public Insurance read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Insurance update(Insurance insurance) {
        return repository.update(insurance);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
