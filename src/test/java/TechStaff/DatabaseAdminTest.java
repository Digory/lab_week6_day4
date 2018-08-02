package TechStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin jerry;

    @Before
    public void before(){
        jerry = new DatabaseAdmin("Jerry", "ieha1289739821", 200000.00);
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
        assertEquals(200000, jerry.getSalary(), 0.0);
    }

    @Test
    public void canGetRaise(){
        jerry.raiseSalary(2000);
        assertEquals(202000, jerry.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(2000,jerry.payBonus(), 0.0);
    }
}