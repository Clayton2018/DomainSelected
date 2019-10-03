package c.service.vehicle;

import c.domain.vehicle.Suv;
import c.service.Service;

import java.util.Set;

public interface SUVService extends Service<Suv,String> {

    Set<Suv>getAll();

}
