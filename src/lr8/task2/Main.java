package lr8.task2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {

            //Создание исходного файла text.txt и запись в него
            File f1 = new File("src/lr8/task2/text.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "UTF8");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Введите первую строку: ");
            String str1 = sc.nextLine();
            wr.writeUTF(str1);
            System.out.println("Введите вторую строку: ");
            String str2 = sc.nextLine();
            wr.writeUTF(str2);
            System.out.println("Введите 5 чисел типа double: ");
            for (int i = 0; i < 5; i++) wr.writeFloat(sc.nextFloat());
            wr.flush();
            wr.close();

            // Создание потоков для чтения и записи с кодировкой UTF-8
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src/lr8/task2/text.txt"), "cp1251"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/lr8/task2/text2.txt"), "cp1251"));
            // Переписывание информации из одного файла в другой
            int lineCount = 0; // счетчик строк
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s); // запись без перевода строки
                bw.newLine(); // принудительный переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
