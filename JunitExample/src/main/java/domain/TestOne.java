package domain;

import static org.junit.Assert.assertEquals;

import org.Calculator;
import org.junit.Test;

public class TestOne {
    @Test
    public void checkFindBiggest() {
        assertEquals(33, Calculator.findBiggest(10, 20, 50));
    }


}
