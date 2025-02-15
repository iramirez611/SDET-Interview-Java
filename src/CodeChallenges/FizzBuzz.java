package CodeChallenges;

public class FizzBuzz {
    public static void main(String[] args){
        /*
         * FizzBuzz. Print numbers from 1 to 100
         * - If a number is divisible by 3 print Fizz
         * - If a number is divisible by 5 print Buzz
         * - If a number is divisible by both 3 and 5 print FizzBuzz
         */

        fizzBuzz(100);
    }

    /**
     * Fizz buzz.
     *
     * @param n The number of numbers to be evaluated
     */
    public static void fizzBuzz(int n){
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            }else if(i % 5 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
