package gr.aueb.cf.ch14;

public class ValidationUtils {
    private static int count = 0;

    private ValidationUtils() {

    }

    public static boolean isBetween(String str) {
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return (1<= count &&  count <= 31);
    }

    public static boolean isBetween(int i) {
        return (i>=1 && i<=10);
    }

}
