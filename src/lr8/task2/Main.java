package lr8.task2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream rd = null;
        DataOutputStream wr1 = null;
        DataOutputStream wr2 = null;
        try {
            //Создание исходного файла text.txt и запись в него
            File f1 = new File("src/lr8/task2/text.txt");
            f1.createNewFile();

            Scanner sc = new Scanner(System.in, "cp1251");
            wr1 = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));

            System.out.println("Введите первую строку: ");
            String str1 = sc.nextLine();
            wr1.writeUTF(str1);
            wr1.writeUTF("\n");

            System.out.println("Введите вторую строку: ");
            String str2 = sc.nextLine();
            wr1.writeUTF(str2);
            wr1.writeUTF("\n");

            System.out.println("Введите 5 чисел типа double: ");
            for (int i = 0; i < 5; i++) {
                wr1.writeDouble(sc.nextDouble());
                wr1.writeUTF("\n");
            }

            rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr2 = new DataOutputStream(new FileOutputStream("src/lr8/task2/text2.txt"));
            System.out.println(rd.readUTF());
            wr2.writeUTF(rd.readUTF());
            for (int i = 1; i <= 5; i++) {
                double num = rd.readDouble();
                System.out.println(num);
                if (num > 0) {
                    wr2.writeDouble(num);
                    wr2.writeUTF("\n");
                }
            }
            // Создание потоков для чтения и записи с кодировкой UTF-8
//            br = new BufferedReader(new InputStreamReader(new FileInputStream("src/lr8/task2/text.txt"), "cp1251"));
//            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/lr8/task2/text2.txt"), "cp1251"));
            // Переписывание информации из одного файла в другой
//            br.readLine();
//            bw.write(br.readLine());
//            bw.newLine();
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(br.read());
//                double num = br.readLine();
//                if (num > 0) {
//                    bw.write(num);
//                    bw.newLine();
//                }
//            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        } finally {
            wr1.flush();
            wr1.close();
        }
    }
}
