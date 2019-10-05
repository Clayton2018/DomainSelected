/*package c.repositories.workshop.impl;

import c.domain.workshop.Workshop;
import c.repositories.workshop.WorkshopRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class WorkshopRepositoryImpl implements WorkshopRepository {

    private static WorkshopRepositoryImpl workshopRepo = null;
    private Map<String, Workshop> workshopCode;

    public WorkshopRepositoryImpl() {

        workshopCode = new HashMap<>();

    }

    public static WorkshopRepositoryImpl getWorkshopRepo() {

        if (workshopRepo == null){

            return new WorkshopRepositoryImpl();

        }

        return workshopRepo;

    }

    @Override
    public Set<Workshop> getAll() {
        return new HashSet<>(workshopCode.values());
    }

    @Override
    public Workshop create(Workshop workshop) {

        workshopCode.put(workshop.getWorkshopName(), workshop);
        return workshop;

    }

    @Override
    public Workshop read(String str) {

        return workshopCode.get(str);

    }

    @Override
    public Workshop update(Workshop workshop) {

        workshopCode.replace(workshop.getWorkshopName(), workshop);
        return workshopCode.get(workshop.getWorkshopName());

    }

    @Override
    public void delete(String str) {

        workshopCode.remove(str);

    }
}

 */
