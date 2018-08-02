package Staff;

import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ManagerTest {
    Manager jerry;

    @Before
    public void before(){
        jerry = new Manager("Jerry", "ieha1289739821", 100000.00, "Balloons");
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
        assertEquals(100000, jerry.getSalary(), 0.0);
    }

    @Test
    public void canGetRaise(){
        jerry.raiseSalary(1000);
        assertEquals(101000, jerry.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1000,jerry.payBonus(), 0.0);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Balloons", jerry.getDeptName());
    }
}
