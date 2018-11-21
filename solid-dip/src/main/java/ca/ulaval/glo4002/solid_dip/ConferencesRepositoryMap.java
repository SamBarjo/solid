package ca.ulaval.glo4002.solid_dip;

import java.util.HashMap;
import java.util.Map;

public class ConferencesRepositoryMap implements ConferencesRepository {

    public Map<String, Conference> conferences = new HashMap<>();

    @Override
    public void persist(Conference conference) {
        conferences.put(conference.name, conference);
    }

    @Override
    public Conference findByName(String name) {
        return conferences.get(name);
    }

    @Override
    public Conference[] findAll() {
        return conferences.values().toArray(new Conference[conferences.size()]);
    }

}
