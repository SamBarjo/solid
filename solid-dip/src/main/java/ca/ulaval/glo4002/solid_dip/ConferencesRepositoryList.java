package ca.ulaval.glo4002.solid_dip;

import java.util.LinkedList;
import java.util.List;

public class ConferencesRepositoryList implements ConferencesRepository {

    public List<Conference> conferences = new LinkedList<>();

    @Override
    public void persist(Conference conference) {
        conferences.add(conference);
    }

    @Override
    public Conference findByName(String name) {
        for (Conference conference : conferences) {
            if (conference.name == name) {
                return conference;
            }
        }
        return null;
    }

    @Override
    public Conference[] findAll() {
        return conferences.toArray(new Conference[conferences.size()]);
    }

}
