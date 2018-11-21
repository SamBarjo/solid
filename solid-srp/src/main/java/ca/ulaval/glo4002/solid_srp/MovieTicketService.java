package ca.ulaval.glo4002.solid_srp;

public class MovieTicketService {

    private static final int MAXIMUM_AGE_CHILD_PRICE = 10;
    private TicketPrinter printer;

    public MovieTicketService(TicketPrinter printer) {
        this.printer = printer;
    }

    // TODO add : a flag to know if this is a student. Apply 10%.
    // TODO add : a flag to know whether the ticket should be printed or not.
    public void generateMovieTicket(int personAge, boolean isStudent, boolean printTicket) {
        if (printTicket) {
            if (personAge <= MAXIMUM_AGE_CHILD_PRICE) {
                print(new ChildMovieTicket(isStudent));
            } else {
                print(new RegularMovieTicket(isStudent));
            }
        }
    }

    private void print(MovieTicket ticket) {
        printer.print(ticket);
    }
}
