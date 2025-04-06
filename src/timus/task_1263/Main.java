package timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] votes = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int candidate = in.nextInt();
            votes[candidate]++;
        }

        for (int i = 1; i <= N; i++) {
            double percent = votes[i] / (double) M * 100;
            System.out.printf("%.2f%%\n", percent);
        }
        in.close();
    }
}
