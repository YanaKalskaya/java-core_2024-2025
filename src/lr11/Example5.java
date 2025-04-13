package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите подстроку, которую должна содержать строка: ");
        String str = in.nextLine();

        String string = "Напишите функцию, которая принимает на вход список строк " +
                "и возвращает новый список, содержащий только те строки, " +
                "которые содержат заданную подстроку";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterWithSubstring(strings, str);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterWithSubstring(List<String> list, String str) {
        return list.stream()
                .filter(s -> s.contains(str))
                .collect(Collectors.toList());
    }
}
