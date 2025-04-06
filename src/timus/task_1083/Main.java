package timus.task_1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextLine().length() - 1;

        int factorial = 1;
        int current = n;

        while (current > 0) {
            factorial *= current;
            current -= k;
        }

        System.out.println(factorial);
        in.close();
    }
}
