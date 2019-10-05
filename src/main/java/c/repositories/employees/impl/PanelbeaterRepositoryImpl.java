/*package c.repositories.employees.impl;

import c.domain.employee.Panelbeater;
import c.repositories.employees.PanelbeaterRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class PanelbeaterRepositoryImpl implements PanelbeaterRepository {

    private static PanelbeaterRepositoryImpl panelbeaterRepo = null;
    private Map<Integer, Panelbeater> panelbeaterEmp;

    public PanelbeaterRepositoryImpl(){

        panelbeaterEmp = new HashMap<>();

    }

    public static PanelbeaterRepositoryImpl getPanelbeaterRepo(){

        if(panelbeaterRepo == null){

            return new PanelbeaterRepositoryImpl();

        }

        return panelbeaterRepo;

    }

    @Override
    public Set<Panelbeater> getAll() {
        return new HashSet<>(panelbeaterEmp.values());
    }

    @Override
    public Panelbeater create(Panelbeater panelbeater) {

        panelbeaterEmp.put(panelbeater.getEmpID(), panelbeater);
        return panelbeater;
    }

    @Override
    public Panelbeater read(Integer integer) {

        return panelbeaterEmp.get(integer);
    }

    @Override
    public Panelbeater update(Panelbeater panelbeater) {

        panelbeaterEmp.replace(panelbeater.getEmpID(), panelbeater);
        return panelbeaterEmp.get(panelbeater.getEmpID());
    }

    @Override
    public void delete(Integer integer) {

        panelbeaterEmp.remove(integer);

    }

}

 */
