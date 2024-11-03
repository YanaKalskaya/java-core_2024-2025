package lr3;

import java.util.Scanner;

public class Example5v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int num = in.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; ; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i);
                if (count + 1 < num) {
                    System.out.print(" + ");
                }
                sum += i;
                count++;
            }
            i++;
            if (count == num) break;
        }
        System.out.println(" = " + sum);
    }
}
