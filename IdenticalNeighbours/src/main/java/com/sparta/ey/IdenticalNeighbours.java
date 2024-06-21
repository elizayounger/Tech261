package com.sparta.ey;

// Create a method which checks whether an array of integers contains the same value 3 times in a row.
//For example: { 2, 3, 3, 3, 5, 7 } returns true whilst { 3, 4, 5, 1, 2 } returns false

public class IdenticalNeighbours {
    public static void main(String[] args) {
//        int[] nums = { 2, 3, 3, 3, 5, 7 };
        int[] nums = { 3, 4, 5, 1, 2 };
        boolean result = hasRowOfThree(nums);
        System.out.println(result);
    }

    public static boolean hasRowOfThree(int[] nums) {
        if (nums.length < 3) {
            return(false);
        }
        // checks array is at least 3 in length
        int checkIterations = nums.length - 2;
        for (int index = 0; index < checkIterations; index++) {
            if (nums[index] == nums[index+1] && nums[index] == nums[index+2]) {
                return true;
            }
        }
        return false;
    }
}
