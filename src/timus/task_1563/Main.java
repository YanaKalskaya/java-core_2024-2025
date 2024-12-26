package timus.task_1563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int skip = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] shops = new String[n];
        for (int i = 0; i < n; i++) {
            shops[i] = in.nextLine();
            if(i > 0) {
                for(int j = 0; j < i; j++) {
                    if(shops[j].equals(shops[i])) {
                        skip++;
                        break;
                    }
                }
            }
        }
        System.out.println(skip);
    }
}
