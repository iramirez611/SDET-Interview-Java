package CodeChallenges;

import java.util.LinkedHashMap;

public class CountLettersWord {
    public static void main(String[] args){

        String str0 = "Hello World";
        LinkedHashMap<Character, Integer> lettersStr0 = countLetters(str0.replace(" ",""));
        System.out.println(str0 + ": " + lettersStr0);
    }

    /**
     * Count letters linked hash map.
     *
     * @param str the str
     * @return the linked hash map
     */
    public static LinkedHashMap<Character, Integer> countLetters(String str){
        //If order is matter we can use a LinkedHashMap
        LinkedHashMap<Character,Integer> letters = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //If LinkedHashMap already contains the letter gets the value and put back with +1
            if(letters.containsKey(ch)){
                letters.put(ch, letters.get(ch)+1);
            }else{
                //If LinkedHashMap does not contain the letter as key the letter is added with the value 1
                letters.put(ch, 1);
            }
        }
        return letters;
    }
}
