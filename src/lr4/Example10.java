package lr4;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] alphabet = {'ч', 'а', 'е', 'г', 'в', 'о'};
        System.out.println("Алфавит: ");
        for (char letter : alphabet) {
            System.out.print(letter + " ");
        }
        System.out.println(" ");
        System.out.println("Введите текст для шифрования в данном алфавите: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();

        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int indexOfEl = new String(alphabet).indexOf(characters[i]);
            if (indexOfEl + key < alphabet.length) {
                characters[i] = alphabet[indexOfEl + key];
            }
            if (indexOfEl + key >= alphabet.length) {
                characters[i] = alphabet[(indexOfEl + key)%alphabet.length];
            }
        }
        String encryptedText = new String(characters);

        System.out.println("Текст после преобразования: ");
        System.out.println(encryptedText);

        System.out.println("«Выполнить обратное преобразование? (y/n)");
        String answer = in.nextLine();
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("Введите корректный ответ: ");
            answer = in.nextLine();
        }

        if (answer.equals("y")) {
            char[] characters2 = encryptedText.toCharArray();
            for (int i = 0; i < characters2.length; i++) {
                int indexOfEl = new String(alphabet).indexOf(characters2[i]);
                if (indexOfEl - key >= 0) {
                    characters2[i] = alphabet[indexOfEl - key];
                }
                if (indexOfEl - key < 0) {
                    characters2[i] = alphabet[alphabet.length + indexOfEl - key];
                }
            }
            String decryptedText = new String(characters2);
            System.out.println("Результат обратного преобразования: " + decryptedText);
        } else {
            System.out.println("До свидания!");
        }
    }
}
