package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вашу фамилию: ");
        String surname = scanner.nextLine();

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите ваше отчество: ");
        String patronymic = scanner.nextLine();

        System.out.println("Hello, " + surname + " " + name + " " + patronymic);
        scanner.close();
    }
}
