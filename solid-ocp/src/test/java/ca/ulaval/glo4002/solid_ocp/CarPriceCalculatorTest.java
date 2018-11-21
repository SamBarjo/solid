package ca.ulaval.glo4002.solid_ocp;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarPriceCalculatorTest {

    private static final int POLLUTION_TAX = 1000;
    private static final int NO_POLLUTION_TAX = 0;

    @InjectMocks
    private CarPriceCalculator calculator;

    @Test
    public void hummerHasAPollutionTax() {
        final int hummerPrice = 50000;
        Car hummer = createCarMock(Hummer.class, hummerPrice, POLLUTION_TAX);

        int totalPrice = calculator.calculatePrice(hummer);

        assertEquals(hummerPrice + POLLUTION_TAX, totalPrice);
    }

    @Test
    public void yarisHasNoPollutionTax() {
        final int yarisPrice = 20000;
        Car yaris = createCarMock(Yaris.class, yarisPrice, NO_POLLUTION_TAX);

        int totalPrice = calculator.calculatePrice(yaris);

        assertEquals(yarisPrice, totalPrice);
    }

    @Test
    public void ecoHummerHasNoPollutionTax() {
        final int hummerPrice = 50000;
        Car ecoHummer = createCarMock(EcoHummer.class, hummerPrice, NO_POLLUTION_TAX);

        int totalPrice = calculator.calculatePrice(ecoHummer);

        assertEquals(hummerPrice, totalPrice);
    }

    private Car createCarMock(Class<? extends Car> carType, int price, int pollutionTax) {
        Car carMock = mock(carType);
        willReturn(price).given(carMock).getPrice();
        willReturn(pollutionTax).given(carMock).getPollutionTax();
        return carMock;
    }

}
