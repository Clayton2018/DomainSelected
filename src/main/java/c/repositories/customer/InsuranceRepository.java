package c.repositories.customer;

import c.domain.customer.Insurance;
import c.repositories.Repository;

import java.util.Set;

public interface InsuranceRepository extends Repository<Insurance, Integer> {

    Set<Insurance>getAll();

}
