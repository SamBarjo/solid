package ca.ulaval.glo4002.solid_lsp;

import static org.junit.Assert.*;

import org.junit.Test;

// This is an integration test
public class BoatConfiguratorTest {

    @Test
    public void canConfigureABoat() {
        final String color = "blue";
        final String expectedCabinColor = "dark blue";
        Boat boat = new Boat();

        new BoatConfigurator(boat).withColor(color).withLength(50);

        assertEquals(expectedCabinColor, boat.getCabinColor());
    }
}
