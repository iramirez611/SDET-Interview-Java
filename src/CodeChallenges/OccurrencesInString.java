package CodeChallenges;

public class OccurrencesInString {
    public static void main(String[] args){
        String str = "Banana";
        char letter = 'a';

        System.out.println(str + " | " + getOccurrencesInString(str.toLowerCase(),letter) + " | " + letter);

        System.out.println("******************************");

        String str2 = "Esternocleidomastoideo";
        char letter2 = 'e';

        System.out.println(str2 + " | " + getOccurrencesInString2(str2.toLowerCase(),letter2) + " | " + letter2);

    }

    /**
     * Get occurrences in string int using toCharArray() method
     *
     * @param str    The string to be evaluated
     * @param letter the letter to find
     * @return the number of occurrences of the letter in the string
     */
    public static int getOccurrencesInString(String str, char letter){
        int count = 0;
        for(char ch: str.toCharArray()){
            if(ch == letter){
                count++;
            }
        }
        return count;
    }

    /**
     * Get occurrences in string int using charAt() method
     *
     * @param str    The string to be evaluated
     * @param letter the letter to find
     * @return the number of occurrences of the letter in the string
     */
    public static int getOccurrencesInString2(String str, char letter){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
}
