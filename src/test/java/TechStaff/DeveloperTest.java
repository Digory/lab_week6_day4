package TechStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer jerry;

    @Before
    public void before(){
        jerry = new Developer("Jerry", "ieha1289739821", 900000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jerry", jerry.getName());
    }

    @Test
    public void hasNino(){
        assertEquals("ieha1289739821", jerry.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(900000, jerry.getSalary(), 0.0);
    }

    @Test
    public void canGetRaise(){
        jerry.raiseSalary(9000);
        assertEquals(909000, jerry.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(9000,jerry.payBonus(), 0.0);
    }
}