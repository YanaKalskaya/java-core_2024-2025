package timus.task_1224;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();

        if(n <= m) {
            System.out.print(2 * n - 2);
        } else {
            System.out.print(2 * m - 1);
        }
        in.close();
    }
}
