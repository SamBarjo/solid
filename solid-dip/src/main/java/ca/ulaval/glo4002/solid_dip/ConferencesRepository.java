package ca.ulaval.glo4002.solid_dip;

public interface ConferencesRepository {
    void persist(Conference conference);
    Conference findByName(String name);
    Conference[] findAll();
}
