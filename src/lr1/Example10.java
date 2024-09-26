package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш год рождения: ");
        int yearBirth = scanner.nextInt();
        int age = 2024 - yearBirth;
        System.out.println("Ваш возраст: " + age);
    }
}
