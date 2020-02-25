import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class CalculTaxesTest {

    @Test
    public void testCalculerTaxes(){
        assertEquals(11498,
                CalculTaxes.calculerTaxes(10000, true, true));
    }
    @Test
    public void testException(){
        assertThrows(IllegalArgumentException.class,
                ()->{CalculTaxes.calculerTaxes(-1, true, true);});
    }
    @Test
    public void testOnlyFed(){
        assertEquals(10500,
                CalculTaxes.calculerTaxes(10000, false,true));
    }

    @Test
    public void testOnlyProv(){
        assertEquals(10998,
                CalculTaxes.calculerTaxes(10000, true,false));
    }

    @Test
    public void testNoTaxes(){
        assertEquals(10000,
                CalculTaxes.calculerTaxes(10000, false,false));
    }

    @Test
    public void testExceptionNoTaxes(){
        assertThrows(IllegalArgumentException.class,
                ()->{CalculTaxes.calculerTaxes(-1,false,false);});
    }


}
