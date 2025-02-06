package CodeChallenges;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArray("Original -> ", arr);

        int[] reversedArray = reverseArray(arr);
        printArray("Reversed -> ", reversedArray);

    }

    public static int[] reverseArray(int[] arr) {

        int start = 0;
        int end =  arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    public static void printArray(String str, int[] arr) {
        System.out.println(str + Arrays.toString(arr));
    }
}
