package timus.task_1638;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int volumeWidth = in.nextInt();
        int coverWidth = in.nextInt();
        int firstBook = in.nextInt();
        int lastBook = in.nextInt();

        int booksDiff = Math.abs(firstBook - lastBook);

        int result = booksDiff * 2 * coverWidth;

        if (firstBook > lastBook) {
            result += (booksDiff + 1) * volumeWidth;
        } else {
            result += (booksDiff - 1) * volumeWidth;
        }

        System.out.println(result);
        in.close();
    }
}
