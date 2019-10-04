package c.repositories.employees.impl;

import c.domain.employee.Administrator;
import c.repositories.employees.AdministratorRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class AdministratorRepositoryImpl implements AdministratorRepository {

    private static AdministratorRepositoryImpl adminRepo = null;
    private Map<Integer, Administrator> adminEmp;

    public AdministratorRepositoryImpl(){

        adminEmp = new HashMap<>();

    }

    public static AdministratorRepositoryImpl getAdminRepo(){

        if(adminRepo == null){

            return new AdministratorRepositoryImpl();

        }

        return adminRepo;

    }

    @Override
    public Set<Administrator> getAll() {
        return new HashSet<>(adminEmp.values());
    }

    @Override
    public Administrator create(Administrator administrator) {
        adminEmp.put(administrator.getEmpID(),administrator);

        return administrator;
    }

    @Override
    public Administrator read(Integer integer) {
        return adminEmp.get(integer);
    }

    @Override
    public Administrator update(Administrator administrator) {

        adminEmp.replace(administrator.getEmpID(), administrator);
        return adminEmp.get(administrator.getEmpID());
    }

    @Override
    public void delete(Integer integer) {

        adminEmp.remove(integer);

    }
}
