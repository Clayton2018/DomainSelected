package c.repositories.customer.impl;

import c.domain.customer.Insurance;
import c.repositories.customer.InsuranceRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InsuranceRepositoryImpl implements InsuranceRepository {

    private static InsuranceRepositoryImpl insuranceRepo = null;
    private Map<Integer, Insurance> insuranceCode;

    public InsuranceRepositoryImpl() {

        insuranceCode = new HashMap<>();

    }

    public static InsuranceRepositoryImpl getInsuranceRepo() {

        if (insuranceRepo == null){

            return new InsuranceRepositoryImpl();

        }

        return insuranceRepo;

    }

    @Override
    public Set<Insurance> getAll() {
        return new HashSet<>(insuranceCode.values());
    }

    @Override
    public Insurance create(Insurance insurance) {

        insuranceCode.put(insurance.getInsuranceId(), insurance);
        return insurance;
    }

    @Override
    public Insurance read(Integer integer) {
        return insuranceCode.get(integer);
    }

    @Override
    public Insurance update(Insurance insurance) {

        insuranceCode.replace(insurance.getInsuranceId(), insurance);
        return insuranceCode.get(insurance.getInsuranceId());
    }

    @Override
    public void delete(Integer integer) {

        insuranceCode.remove(integer);

    }
}
