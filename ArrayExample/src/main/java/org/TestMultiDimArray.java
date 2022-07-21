package org;

import java.util.Scanner;

public class TestMultiDimArray {

    public static void main(String[] args) {
        var nums = new int[3][3];
        //nums[0][0]=100;
        //nums[0][1]=200;
        //nums[0][2]=100;
        //nums[1][0]=200;
        System.out.println("Enter the values for array");
        var scn = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }


    }

}
