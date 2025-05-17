package timus.task_1079;

import java.util.Scanner;

public class Main {
    private static int[] cache;

    public static int calculateA(int i) {
        if (cache[i] != 0) {
            return cache[i];
        }
        
        if (i == 0) return 0;
        if (i == 1) return 1;
        
        if (i % 2 == 0) {
            cache[i] = calculateA(i / 2);
        } else {
            cache[i] = calculateA(i / 2) + calculateA(i / 2 + 1);
        }
        return cache[i];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        cache = new int[100000]; // Максимальное значение n + 1
        cache[0] = 0;
        cache[1] = 1;
        
        while (true) {
            int n = in.nextInt();
            if (n == 0) break;
            
            int max = 0;
            for (int i = 0; i <= n; i++) {
                int current = calculateA(i);
                if (current > max) {
                    max = current;
                }
            }
            System.out.println(max);
        }
    }
}
