package CodeChallenges;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "apple"; //elppa
        String s2 = "Phone"; //enohP
        String s3 = "12345"; //54321

        System.out.println("Original string: " + s1 + " | Reverse string: " + ReverseStr(s1));
        System.out.println("Original string: " + s2 + " | Reverse string: " + ReverseStr(s2));
        System.out.println("Original string: " + s3 + " | Reverse string: " + ReverseStr(s3));

    }

    /**
     * Reverse str string.
     *
     * @param str Original string
     * @return The reverse string
     */
    public static String ReverseStr(String str){
        /* StringBuilder object to access to the append method in order to
        *  can store each character in reverse order
        * */
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length() - 1; i >=  0; i--){
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
}


