package roart;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
    
    @Test
    public void test() throws Exception {
        int number;
        number = Main.findMultiplier(32);
        assertEquals(225, number);
        number = Main.findMultiplier(16);
        assertEquals(60, number);
        number = Main.findMultiplier(10);
        assertEquals(23, number);
        number = Main.findMultiplier(9);
        assertEquals(14, number);
        number = Main.findMultiplier(4);
        assertEquals(3, number);
        number = Main.findMultiplier(3);
        assertEquals(0, number);
        number = Main.findMultiplier(2);
        assertEquals(0, number);
        number = Main.findMultiplier(1);
        assertEquals(0, number);
        number = Main.findMultiplier(0);
        assertEquals(0, number);
        // just make sure we get 0 here, too, otherwise 
        // an exception is an alternative
        // because natural numbers was specified
        number = Main.findMultiplier(-1);
        assertEquals(0, number);
    }
}
