package org;

import java.util.Scanner;

public class MAddition {

    public static void main(String[] args) {
        var num1 = new int[3][3];
		var num2 = new int[3][3];
		var sum = new int[3][3];

        System.out.println("Enter the values for array num1: ");
		var scn = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num1[i][j] = scn.nextInt();
            }
        }

        System.out.println("Enter the values for array num2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num2[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = num1[i][j] + num2[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
