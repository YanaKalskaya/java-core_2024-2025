package timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int examsNumber = in.nextInt();

        boolean allFives = true;
        int sumGrades = 0;

        for (int i = 0; i < examsNumber; i++) {
            int grade = in.nextInt();
            if (grade <= 3) {
                System.out.println("None");
                return;
            }
            if (grade < 5) {
                allFives = false;
            }
            sumGrades += grade;
        }

        if (allFives) {
            System.out.println("Named");
        } else {
            double average = (double) sumGrades / examsNumber;
            if (average >= 4.5) {
                System.out.println("High");
            } else {
                System.out.println("Common");
            }
        }
    }
}
