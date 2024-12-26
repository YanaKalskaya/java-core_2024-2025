package lr8.project1;

import java.io.File;

public class KlassFile1 {
    public static void main(String[] args) {
        try {
//  Создание файла в текущей папке (где расположен файл KlassFile1.java),
//  кажется не в текущей, а в главной папке проекта создается
            File f1 = new File("MyFile1.txt"); //  имя нового файла
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Создан!!!!");
                System.out.println("Полный путь1:	" + f1.getAbsolutePath());
            }

// Создание файла на диске D и вывод полного пути
            File f2=new File("D:\\files\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2:	" + f2.getAbsolutePath());

// Создание нескольких вложенных папок
            File f3 = new File("D:\\files\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь 3:	" + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка!!! " + e);
        }
    }
}
