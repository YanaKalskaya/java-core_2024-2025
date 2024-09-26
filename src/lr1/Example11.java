package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите год вашего рождения: ");
        int yearBirth = scanner.nextInt();
        int age = 2024 - yearBirth;
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваш возраст: " + age);
        scanner.close();
    }
}
