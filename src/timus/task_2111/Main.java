package timus.task_2111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] d = new int[n];

        long totalWeight = 0;
        for (int i = 0; i < n; i++) {
            d[i] = in.nextInt();
            totalWeight += d[i];
        }

        long tax = 0;
        for (int i = 0; i < n; i++) {
            tax += d[i] * totalWeight;
        }

        System.out.println(tax);
    }
}
