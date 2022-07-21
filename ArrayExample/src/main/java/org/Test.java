package org;

public class Test {

    public static void main(String[] args) {
        var nums = new int[5];
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 300;
        nums[3] = 500;
        nums[4] = 900;
        System.out.println(nums[4]);
        System.out.println(nums.length);

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        for (int placeholder : nums) {
            System.out.println(placeholder);
        }


        String[] cities = {"Delhi", "London", "NYC", "Capetown", "LA", "Maimi", "Shanghai"};

//        for (int i = 0; i < cities.length; i++) {
//            System.out.println(cities[i]);
//        }

        for (String temp : cities) {
            System.out.println(temp);
        }

        int[] num2 = {100, 300, 456, 77, 888}; //0-4
        int[] num3;
        num3 = new int[5];


    }

}
