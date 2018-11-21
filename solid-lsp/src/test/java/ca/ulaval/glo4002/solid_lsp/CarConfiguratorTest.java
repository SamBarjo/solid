package ca.ulaval.glo4002.solid_lsp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarConfiguratorTest {
    @Test
    public void canConfigureACar() {
        final int length = 10;
        final int expectedWidth = 5;
        Car car = new Car();

        new CarConfigurator(car).withColor("orange").withLength(length).withWheels(4);

        assertEquals(expectedWidth, car.getWidth());
    }
}
