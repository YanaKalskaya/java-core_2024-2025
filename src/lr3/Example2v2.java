package lr3;

import java.util.Scanner;

public class Example2v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели с большой буквы: ");
        String day = in.nextLine();
        System.out.print("Порядковый номер для дня недели " + day + " : ");
        if (day.equals("Понедельник")) {
            System.out.print("1");
        } else if (day.equals("Вторник")) {
            System.out.print("2");
        } else if (day.equals("Среда")) {
            System.out.print("3");
        } else if (day.equals("Четверг")) {
            System.out.print("4");
        } else if (day.equals("Пятница")) {
            System.out.print("5");
        } else if (day.equals("Суббота")) {
            System.out.print("6");
        } else if (day.equals("Воскресение")) {
            System.out.print("7");
        } else {
            System.out.println("не существует");
            System.out.println("Введено некорректное название дня недели");
        }
    }
}
