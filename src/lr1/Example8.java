package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название сегодняшнего дня недели: ");
        String dayOfWeek = scanner.nextLine();

        System.out.println("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.println("Введите сегодняшнюю дату: ");
        int date = scanner.nextInt();

        System.out.println("Сегодня " + dayOfWeek + ", " + date + " " + month);
        scanner.close();
    }
}
