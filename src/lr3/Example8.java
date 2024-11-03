package lr3;

public class Example8 {
    public static void main(String[] args) {
        int size = 10;
        char arr[] = new char[size];
        char letter = 'A';
        for (int i = 0; i < size; i++) {
            if (letter == 'A' || letter == 'E' || letter == 'I') {
                letter += 1;
            }
            arr[i] = letter;
            letter++;
        }
        System.out.print("Элементы массива: ");
        for (char l : arr) {
            System.out.print(l + " ");
        }
    }
}
