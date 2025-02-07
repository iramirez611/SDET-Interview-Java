package CodeChallenges;

public class ReverseWords {
    public static void main(String[] args) {

        String s1 = "apple banana kiwi";
        String s2 = "I am John Doe";
        String s3 = "Orange";

        System.out.println("Original string: " + s1 + " | Reverse string: " + reverseWords(s1));
        System.out.println("Original string: " + s2 + " | Reverse string: " + reverseWords(s2));
        System.out.println("Original string: " + s3 + " | Reverse string: " + reverseWords(s3));

    }

    /**
     * Reverse words string.
     *
     * @param str the str with the original words order
     * @return the string with the words in reverse order
     */
    public static String reverseWords(String str) {
        StringBuilder reversedWords = new StringBuilder();
        String[] words = str.split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            reversedWords.append(words[i]).append(" ");
        }

        return reversedWords.toString().trim();
    }
}
