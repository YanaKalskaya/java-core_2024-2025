package timus.task_1991;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int unusedBoomBooms = 0;
        int remainingDroids = 0;

        for (int i = 0; i < n; i++) {
            int boomBooms = in.nextInt();
            if (boomBooms > k) {
                unusedBoomBooms += (boomBooms - k);
            } else {
                remainingDroids += (k - boomBooms);
            }
        }

        in.close();
        System.out.println(unusedBoomBooms + " " + remainingDroids);
    }
}
