package ca.ulaval.glo4002.solid_lsp;

public class BoatConfigurator {

    private Boat boat;

    public BoatConfigurator(Boat boat) {
        this.boat = boat;
    }

    public BoatConfigurator withColor(String color) {
        boat.setColor(color);
        return this;
    }

    public BoatConfigurator withLength(int length) {
        boat.setLength(length);
        return this;
    }
}
