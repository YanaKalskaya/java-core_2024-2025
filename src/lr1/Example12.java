package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        int yearBirth = 2024 - age;
        System.out.println("Ваш год рождения: " + yearBirth);
    }
}
