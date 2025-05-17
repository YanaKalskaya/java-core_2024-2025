package timus.task_1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] weights = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
            totalSum += weights[i];
        }
        in.close();

        int minDiff = Integer.MAX_VALUE;
        int limit = 1 << n;

        for (int mask = 0; mask < limit; mask++) {
            int sum1 = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum1 += weights[i];
                }
            }
            int sum2 = totalSum - sum1;
            minDiff = Math.min(minDiff, Math.abs(sum1 - sum2));
        }

        System.out.println(minDiff);
    }
}
