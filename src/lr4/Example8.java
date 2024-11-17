package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования на русском языке: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();

        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) (characters[i] + key);
            if (characters[i] > 'я') {
                characters[i] -= 32;
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
                characters2[i] = (char) (characters2[i] - key);
                if (characters2[i] < 'а') {
                    characters2[i] += 32;
                }
            }
            String decryptedText = new String(characters2);
            System.out.println("Результат обратного преобразования: " + decryptedText);
        } else {
            System.out.println("До свидания!");
        }
    }
}
