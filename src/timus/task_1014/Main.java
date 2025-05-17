package timus.task_1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        System.out.println(findMinNum(N));
    }

    private static long findMinNum(long num) {

        if (num == 0) return 10;
        if (num < 10) return num;

        StringBuilder result = new StringBuilder();

        for (int digit = 9; digit > 1; digit--) {
            while (num % digit == 0) {
                result.insert(0, digit);
                num /= digit;
            }
        }

        if (num > 1) return -1;

        return Long.parseLong(result.toString());
    }
}
