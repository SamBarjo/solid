package ca.ulaval.glo4002.solid_srp;

public class MovieTicketFactory {
    private static final int CHILD_MAX_AGE = 10;

    public MovieTicket create(int personAge) {
        if (personAge > CHILD_MAX_AGE) {
            return new RegularMovieTicket(false);
        } else {
            return new ChildMovieTicket(true);
        }
    }
}
