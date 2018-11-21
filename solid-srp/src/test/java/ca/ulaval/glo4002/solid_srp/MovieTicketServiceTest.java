package ca.ulaval.glo4002.solid_srp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MovieTicketServiceTest {

    private static final boolean NOT_A_STUDENT = false;
    private static final boolean IS_A_STUDENT = true;
    private static final boolean PRINT = true;
    private static final boolean DO_NOT_PRINT = false;
    private static final float STUDENT_ADULT_PRICE = 15.0f * 0.9f;
    private static final float FLOAT_PRECISION = 0.01f;

    @Mock
    private TicketPrinter printer;

    @InjectMocks
    private MovieTicketService service;

    @Test
    public void canPrintAChildTicket() {
        final int childAge = 9;

        service.generateMovieTicket(childAge, NOT_A_STUDENT, PRINT);

        verify(printer).print(isA(ChildMovieTicket.class));
    }

    @Test
    public void canPrintARegularTicket() {
        final int notAChildAge = 11;

        service.generateMovieTicket(notAChildAge, NOT_A_STUDENT, PRINT);

        verify(printer).print(isA(RegularMovieTicket.class));
    }

    @Test
    public void canNotPrintTicket() {
        final int anyAge = 36;

        service.generateMovieTicket(anyAge, NOT_A_STUDENT, DO_NOT_PRINT);

        verify(printer, never()).print(isA(MovieTicket.class));
    }

    @Test
    public void canApplyStudentDiscount() {
        final int adultAge = 42;

        service.generateMovieTicket(adultAge, IS_A_STUDENT, PRINT);

        ArgumentCaptor<MovieTicket> argument = ArgumentCaptor.forClass(MovieTicket.class);
        verify(printer).print(argument.capture());
        assertEquals(STUDENT_ADULT_PRICE, argument.getValue().getPrice(), FLOAT_PRECISION);
    }
}
