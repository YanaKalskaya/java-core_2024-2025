package timus.task_1349;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 0) {
            System.out.println(-1);
            return;
        }

        for (int a = 1; a <= 100; a++) {
            for (int b = a + 1; b <= 100; b++) {
                for (int c = b + 1; c <= 100; c++) {
                    if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                        System.out.println(a + " " + b + " " + c);
                        return;
                    }
                }
            }
        }

        System.out.println(-1);
    }
}
