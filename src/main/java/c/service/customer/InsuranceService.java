package c.service.customer;

import c.domain.customer.Insurance;
import c.service.Service;

import java.util.Set;

public interface InsuranceService extends Service<Insurance, Integer> {

    Set<Insurance>getAll();

}
