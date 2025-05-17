package timus.task_1025;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i <= K / 2; i++) {
            count += (arr[i] / 2) + 1;
        }

        System.out.println(count);
        in.close();
    }
}
