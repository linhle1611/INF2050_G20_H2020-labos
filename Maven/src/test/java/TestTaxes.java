import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTaxes {

    @Test
    public void testCalculTaxesVide(){
        assertEquals(0,Taxes.calculTaxes(0,false,false));
    }

    @Test
    public void testCalculTaxes1(){
        assertEquals(105,Taxes.calculTaxes(100,true,false));
    }

    @Test
    public void testCalculTaxes2(){
        assertEquals(110,Taxes.calculTaxes(100,false,true));
    }

    @Test
    public void testCalculTaxes3(){
        assertEquals(115,Taxes.calculTaxes(100,true,true));
    }

    @Test
    public void testCalculTaxesBig(){
        assertEquals(1149750000,Taxes.calculTaxes(1000000000,true,true));
    }

    @Test
    public void testCalculTaxesNeg(){
        assertEquals(-115,Taxes.calculTaxes(-100,true,true));
    }


}