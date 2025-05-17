package timus.task_1545;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();

        ArrayList<String> hieroglyphs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            hieroglyphs.add(in.nextLine());
        }

        char inputChar = in.nextLine().charAt(0);

        for (String glyph : hieroglyphs) {
            if (glyph.charAt(0) == inputChar) {
                System.out.println(glyph);
            }
        }
    }
}
