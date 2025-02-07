package CodeChallenges;

import java.util.Arrays;

public class SumTwoNumbersEqualsToTargetIndexes {
    public static void main(String[] args){

        int[] nums = {1, 8, 1, 4, 9, 2, 7, 11, 15};
        int target = 10;

        System.out.println("Numbers: " + Arrays.toString(nums));
        System.out.println("Target number: " + target);
        System.out.println("Indexes of sum = to target -> " + Arrays.toString(twoSumIndexes(nums, target)));
    }

    /**
     * Two sum of nums into the array equals to the target if true it returns the indexes int [ ].
     *
     * @param nums   the array of numbers
     * @param target the target number
     * @return the int [ ] array that contains the indexes of the 2 number that sum is equals to target
     */
    public static int[] twoSumIndexes(int[] nums, int target){

        int[] SumIndexes = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i +1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    SumIndexes[0] = i;
                    SumIndexes[1] = j;
                }
            }
        }
        return SumIndexes;
    }
}
