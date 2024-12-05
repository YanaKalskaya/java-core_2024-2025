package lr6;

public class Example5Class {
    public static int getSumOfSquares(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i * i;
        }
        return result;
    }
}
