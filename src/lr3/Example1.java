package lr3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер дня недели: ");
        int num = in.nextInt();
        System.out.print("День недели под номером " + num + " - ");
        switch (num) {
            case 1:
                System.out.print("Понедельник");
                break;
            case 2:
                System.out.print("Вторник");
                break;
            case 3:
                System.out.print("Среда");
                break;
            case 4:
                System.out.print("Четверг");
                break;
            case 5:
                System.out.print("Пятница");
                break;
            case 6:
                System.out.print("Суббота");
                break;
            case 7:
                System.out.print("Воскресение");
                break;
            default:
                System.out.println("не существует");
                System.out.println("Введено некорректное значение");
                break;
        }
    }
}
