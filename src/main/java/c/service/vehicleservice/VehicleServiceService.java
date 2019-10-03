package c.service.vehicleservice;

import c.domain.vehicleservice.VehicleService;
import c.service.Service;

import java.util.Set;

public interface VehicleServiceService extends Service<VehicleService, Integer>{

    Set<VehicleService>getAll();

}
