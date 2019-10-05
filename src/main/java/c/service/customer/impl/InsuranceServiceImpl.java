package c.service.customer.impl;

import c.domain.customer.Insurance;
import c.repositories.customer.InsuranceRepository;
import c.service.customer.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("InsuranceServiceImpl")
public class InsuranceServiceImpl implements InsuranceService {

    private InsuranceServiceImpl service = null;
    @Autowired
    private InsuranceRepository repository;


    public InsuranceServiceImpl() {

        //this.repository = InsuranceRepositoryImpl.getInsuranceRepo();

    }

    public InsuranceServiceImpl getService() {

        if (service == null){

            return new InsuranceServiceImpl();

        }

        return service;
    }

    @Override
    public Set<Insurance> getAll() {

        List<Insurance> insuranceList = (List<Insurance>) repository.findAll();
        return new HashSet<>(insuranceList);

    }

    @Override
    public Insurance create(Insurance insurance) {
        return repository.save(insurance);
    }

    @Override
    public Insurance read(Integer integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Insurance update(Insurance insurance) {
        return repository.save(insurance);
    }

    @Override
    public void delete(Integer integer) {

        repository.deleteById(integer);

    }
}
