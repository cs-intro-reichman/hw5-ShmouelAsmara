/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
        System.out.println(countChar(hello, 'h'));
        System.out.println(countChar(hello, 'l'));
        System.out.println(countChar(hello, 'z'));
        System.out.println(spacedString(hello));//// Put your other tests here.
    }

    public static int countChar(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }

        }
        return counter;
    }

    /**
     * Returns true if str1 is a subset string str2, false otherwise
     * Examples:
     * subsetOf("sap","space") returns true
     * subsetOf("spa","space") returns true
     * subsetOf("pass","space") returns false
     * subsetOf("c","space") returns true
     *
     * @param str1 - a string
     * @param str2 - a string
     * @return true is str1 is a subset of str2, false otherwise
     */
    public static boolean subsetOf(String str1, String str2) {
        //// Replace the following statement with your code
        /// 
        if (str1 == null || str2 == null) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (countChar(str2, c) < countChar(str1, c)) {
                return false;
            }
        }
        return true;

    }

    /**
     * Returns a string which is the same as the given string, with a space
     * character inserted after each character in the given string, except
     * for the last character.
     * Example: spacedString("silent") returns "s i l e n t"
     * 
     * @param str - a string
     * @return a string consisting of the characters of str, separated by spaces.
     */
    public static String spacedString(String str) {
        //// Replace the following statement with your code
        String str2 = "";
        if (str.length() == 0) {
            return str2;
        }

        for (int i = 0; i < str.length(); i++) {
            str2 += str.charAt(i);
            if (i < str.length() - 1) {
                str2 += " ";
            }
        }
        return str2;
    }

    /**
     * Returns a string of n lowercase letters, selected randomly from
     * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
     * letter can be selected more than once.
     * 
     * Example: randomStringOfLetters(3) can return "zoo"
     * 
     * @param n - the number of letter to select
     * @return a randomly generated string, consisting of 'n' lowercase letters
     */
    public static String randomStringOfLetters(int n) {
        //// Replace the following statement with your cod
        String random = "";
        for (int i = 0; i < n; i++) {
            random += (char) ('a' + (int) Math.random() * 26);
        }
        return random;
    }

    /**
     * Returns a string consisting of the string str1, minus all the characters in
     * the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: remove("meet","committee") returns "comit"
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
     */
    public static String remove(String str1, String str2) {
        //// Replace the following statement with your code
        String str3 = "";
        if (str1.isEmpty()) {
            return str2;
        }
        if (str1.equals(str2)) {
            return str3;
        }

        str3 = str2;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            int index = str3.indexOf(c);
            if (str3.indexOf(c) == 0) {
                str3 = str3.substring(c + 1);
            } else {
                str3 = str3.substring(0, index) + str1.substring(index + 1);
            }

        }

        return str3;
    }

    /**
     * Returns a string consisting of the given string, with the given
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or
     * "cast", or "cats".
     * 
     * @param ch  - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
        // Generate a random index between 0 and str.length()
        int randomIndex = (int) (Math.random() * (str.length() + 1));
        // Insert the character at the random index
        String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
        return result;
    }
}
