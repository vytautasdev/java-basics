package org;

public class TestArray {

    public static int nums[] = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        for (int i : nums) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    System.out.println("i:" + i + " j:" + nums[j] + " i and j match");
                }
            }
        }
    }
}
