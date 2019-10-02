package c.repositories.vehicle.impl;

import c.domain.vehicle.Suv;
import c.repositories.vehicle.SUVRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SUVRepositoryImpl implements SUVRepository {

    private static SUVRepositoryImpl suvRepo = null;
    private Map<String, Suv> suvCode;

    public SUVRepositoryImpl() {

        suvCode = new HashMap<>();

    }

    public static SUVRepositoryImpl getSuvRepo() {

        if (suvRepo == null){

            return new SUVRepositoryImpl();

        }

        return suvRepo;

    }

    @Override
    public Set<Suv> getAll() {
        return new HashSet<>(suvCode.values());
    }

    @Override
    public Suv create(Suv suv) {

        suvCode.put(suv.getRegistrationNumber(),suv)  ;
        return suv;
    }

    @Override
    public Suv read(String str) {
        return suvCode.get(str);
    }

    @Override
    public Suv update(Suv suv) {

        suvCode.replace(suv.getRegistrationNumber(), suv);
        return suvCode.get(suv.getRegistrationNumber());
    }

    @Override
    public void delete(String str) {

        suvCode.remove(str);

    }
}
