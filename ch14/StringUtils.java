package gr.aueb.cf.ch14;

public class StringUtils {
    private static StringBuilder sb = new StringBuilder();

    private StringUtils() {}

    public static String reverseStr(String str) {
        if (sb.length() != 0) {
            sb.delete(0,sb.length());
        };
        sb.append(str);
        sb.reverse();
        return sb.toString();

    }

    public static String strToUppercase(String str) {
        return str.toUpperCase();

    }

    public static boolean isPalindromic(String str) {
        boolean isPalindromic = true;
        if (sb.length() != 0) {
            sb.delete(0,sb.length());
        };
        sb.append(str.toUpperCase()); // Μετατρέπουμε τo στρινγκ σε κεφαλαία για να κάνει case-insensitive έλεγχο παλίνδρομου
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                isPalindromic = false;

            }
        }
        return isPalindromic;
    }



}
