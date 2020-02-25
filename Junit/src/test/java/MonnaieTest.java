import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonnaieTest {

    @Test
    public void testGetSous() {
        Monnaie m1 = new Monnaie(1000);
        assertEquals(1000, m1.getSous());
    }
    @Test
    public void testAdditionner() {
        Monnaie m1 = new Monnaie(1000);
        Monnaie m2 = new Monnaie(100);
        assertEquals(1100,m1.additionner(m2).getSous());
    }

    @Test
    public void testSoustraire() {
        Monnaie m1 = new Monnaie(1000);
        Monnaie m2 = new Monnaie(100);
        assertEquals(900,m1.soustraire(m2).getSous());
    }
    @Test
    public void testPourcentage() {
        Monnaie m1 = new Monnaie(10000);
        assertEquals(5000, m1.pourcentage(50).getSous());
    }
    @Test
    public void testToString1() {
        Monnaie m1 = new Monnaie(12809);
        assertEquals("128,09$",m1.toString());
    }
}