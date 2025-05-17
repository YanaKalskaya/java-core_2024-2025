package timus.task_1296;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int max = 0;

        for(int i = 0; i < n; i++) {
            int input = in.nextInt();
            sum += input;
            if(sum < 0) sum = 0;
            max = Math.max(sum, max);
        }

        System.out.print(max);
        in.close();
    }
}
