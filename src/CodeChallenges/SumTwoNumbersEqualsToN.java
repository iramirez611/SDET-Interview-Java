package CodeChallenges;

import java.util.Arrays;

public class SumTwoNumbersEqualsToN {
    public static void main(String[] args){

        int[] nums = {1, 8, 1, 4, 9, 2, 7, 11, 15};
        int target = 9;

        System.out.println("Origianl Arra -> " + Arrays.toString(nums) + " | " + target);

        int[] sum = twoSum(nums, target);
        System.out.println("Result Array -> " + Arrays.toString(sum));
    }

    public static int[] twoSum(int[] nums, int target){

        int[] result = new int[2];

        for(int i= 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }
            }
        }

        return result;
    }


}
