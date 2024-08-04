package gr.aueb.cf.ch14;

public class MathHelper {

    private MathHelper() {}

    public static double findAverage(int[] array) {
        double average = 0.0;
        int sum = 0;

        for(int i = 0 ; i < array.length ; i++) {
            sum += array[i];
        }

        average = (double)sum / array.length;
        return average;
    }

    public static int findMax (int[] array) {
        int max = array[0];

        for (int i= 0; i < array.length ; i++) {
            if (array[i] > max ) {
                max = array[i]; }
        }
        return max;
    }

    public static int findMin (int[] array) {
        int min = array[0];

        for (int i= 0; i < array.length ; i++) {
            if (array[i]  < min ) {
                min = array[i]; }
        }
        return min;
    }


}
