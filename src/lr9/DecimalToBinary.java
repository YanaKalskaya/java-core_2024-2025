package lr9;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int decimal = in.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Число в двоичной системе счисления: " + binary);
    }

    private static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "";
        }

        return decimalToBinary(decimal / 2) + decimal % 2;
    }
}
