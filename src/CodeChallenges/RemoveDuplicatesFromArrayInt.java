package CodeChallenges;

import java.util.Arrays;

public class RemoveDuplicatesFromArrayInt {
    public static void main(String[] args){

        int[] nums = {1,1,2,2,3,1,2,2,3,1,1};
        System.out.println("Original array: " + Arrays.toString(nums));

        System.out.println("No duplicates array: " + Arrays.toString(removeDups(nums)));
    }

    /**
     * Remove dups int [ ].
     *
     * @param nums the original array numbers
     * @return the int [ ] with no duplicates
     */
    public static int[] removeDups(int[] nums){

        int[] noDups = new int[nums.length];
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            boolean isDup = false;
            for(int j = 0; j < count; j++){
                if(nums[i] == noDups[j]) {
                    isDup = true;
                    break;
                }
            }
            if(!isDup) noDups[count++] = nums[i];
        }

        //Build an array with the exact length
        noDups = Arrays.copyOf(noDups,count);

        return noDups;
    }
}
