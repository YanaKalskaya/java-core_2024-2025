package lr6;

public class Example8Class {
    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}
