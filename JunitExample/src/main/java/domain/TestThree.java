package domain;

import static org.junit.Assert.assertEquals;

import org.Calculator;
import org.junit.Test;

public class TestThree {
    @Test
    public void checkFindBig() {
        assertEquals(20, Calculator.findBig(10, 20));
        //assertEquals(40,Calculator.findBiggest(10, 20,50));
    }

}
