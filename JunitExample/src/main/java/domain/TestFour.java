package domain;

import static org.junit.Assert.assertEquals;

import org.Calculator;
import org.junit.Test;

public class TestFour {
    @Test
    public void checkFindMax() {
        int[] x = {100, 200, 300, 400, 3, 400, 6, 20};
        assertEquals(400, Calculator.findMax(x));
    }

}
