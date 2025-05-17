package timus.task_1617;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        HashMap<Integer, Integer> diameterCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diameter = in.nextInt();
            diameterCount.put(diameter, diameterCount.getOrDefault(diameter, 0) + 1);
        }

        int wagons = 0;
        for (int count : diameterCount.values()) {
            wagons += count / 4;
        }

        System.out.println(wagons);
    }
}
