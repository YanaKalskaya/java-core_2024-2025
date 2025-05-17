package timus.task_1243;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal bd = new BigDecimal(in.nextLine());
        System.out.println(bd.remainder(BigDecimal.valueOf(7)));
    }
}
