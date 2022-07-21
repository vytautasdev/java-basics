package org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnits {
    @Test
    public void checkFindBig() {
        assertEquals(20, Calculator.findBig(10, 20));
//        assertEquals(40, Calculator.findBiggest(10, 20, 50));
    }

    @Test
    public void checkFindBiggest() {
        assertEquals(50, Calculator.findBiggest(10, 20, 50));
    }

    @Test
    public void checkCCLength() {
        assertEquals(16, Calculator.checkCCNum("1234567893334523"));
    }

    @Test
    public void checkFindMax() {
        int[] x = {100, 200, 300, 400, 3, 400, 6, 20};
        assertEquals(400, Calculator.findMax(x));
    }


}
