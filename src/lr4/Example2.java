package lr4;

public class Example2 {
    public static void main(String[] args) {
        int width = 23;
        int height = 11;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == j) {
                    break;
                }
                System.out.print("+");
            }
            System.out.println(" ");
        }
    }
}
