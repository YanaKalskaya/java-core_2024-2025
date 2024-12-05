package lr6;

public class Example4Class {
    public static int getSecondFact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * getSecondFact(num - 2);
    }
}
