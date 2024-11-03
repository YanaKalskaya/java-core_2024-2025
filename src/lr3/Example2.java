package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели с большой буквы: ");
        String day = in.nextLine();
        System.out.print("Порядковый номер для дня недели " + day + " : ");
        switch (day) {
            case "Понедельник":
                System.out.print("1");
                break;
            case "Вторник":
                System.out.print("2");
                break;
            case "Среда":
                System.out.print("3");
                break;
            case "Четверг":
                System.out.print("4");
                break;
            case "Пятница":
                System.out.print("5");
                break;
            case "Суббота":
                System.out.print("6");
                break;
            case "Воскресение":
                System.out.print("7");
                break;
            default:
                System.out.println("не существует");
                System.out.println("Введено некорректное название дня недели");
                break;
        }
    }
}
