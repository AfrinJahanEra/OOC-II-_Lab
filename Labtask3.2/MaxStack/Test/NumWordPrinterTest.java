package MaxStack.Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumWordPrinterTest {

    @Test
    public void testEven() {
        NumWordPrinter printer = new NumWordPrinter(false);
        assertEquals("Even", printer.printWord(4));
    }

    @Test
    public void testPrimeEleven() {
        NumWordPrinter printer = new NumWordPrinter(false);
        assertEquals("PrimeEleven", printer.printWord(11));
    }

    @Test
    public void testLuckyThirteen() {
        NumWordPrinter printer = new NumWordPrinter(false);
        assertEquals("LuckyThirteen", printer.printWord(13));
    }

    @Test
    public void testEvenPrimeEleven() {
        NumWordPrinter printer = new NumWordPrinter(false);
        assertEquals("EvenPrimeEleven", printer.printWord(22));
    }

    @Test
    public void testEvenPrimeLucky() {
        NumWordPrinter printer = new NumWordPrinter(false);
        assertEquals("EvenPrimeLucky", printer.printWord(286));
    }

    @Test
    public void testOddOneOut() {
        NumWordPrinter printer = new NumWordPrinter(false);
        assertEquals("OddOneOut", printer.printWord(7));
    }

    @Test
    public void testUpperCase() {
        NumWordPrinter printer = new NumWordPrinter(true);
        assertEquals("EVEN", printer.printWord(4));
    }
}
