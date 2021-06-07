import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;
    Bear thinBear;

    @Before
    public void before() {
        bear = new Bear("Baloo", 25, 95.28);
        thinBear = new Bear("Paddignton", 10, 65.90);

    }


    @Test
    public void hasName() {
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight() {

        assertEquals(95.28, bear.getWeight(), 0.0);

    }

    @Test
    public void readyToHibernateIfGreaterThan80() {
        assertEquals(true, bear.readyToHibernate());

    }

    @Test
    public void readyToHibernateIfLessThan80() {

        assertEquals(false, thinBear.readyToHibernate());

    }
}
