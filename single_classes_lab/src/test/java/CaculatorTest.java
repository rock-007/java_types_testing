import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();

    }


    @Test
    public void add() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void subtract() {
        assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    public void multiply(){
        assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    public void divide(){
        assertEquals(5, calculator.divide(25,5), 0.0);
    }

}
