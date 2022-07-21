package org;

import java.util.Scanner;

public class Calculator {
    //unit1
    public static int findBig(int x, int y) {
        //Scanner scn=new Scanner(System.in);
        if (x > y)
            return x;
        else
            return y;
    }

    //for you -find the biggest of 3 numbers
    public static int findBiggest(int x, int y, int z) {
        if (x > y && y > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }

    //check the length of CC num=16
    public static int checkCCNum(String ccNum) {
        var ccLength = ccNum.length();
        return ccLength;
    }

    //find biggest num from an array
    public static int findMax(int nums[]) {
        var max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}
