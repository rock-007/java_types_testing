import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(5, 20);
    }


    @Test
    public void printDocument() {
        printer.printDocument(1, 2);
        assertEquals(3, printer.getPaperLeft());
    }

    @Test
    public void doesntPrint(){
        assertEquals("Please add more paper", printer.printDocument(3,5) );
    }

    @Test
    public void tonerLeft(){
        printer.printDocument(1,2);
        assertEquals(18, printer.getTonerLeft());
    }
}
