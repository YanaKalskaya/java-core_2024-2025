package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {

        String string = "Напишите функцию, которая принимает на вход список строк " +
                "и возвращает новый 2 список, содержащий только те строки, " +
                "которые содержат только буквы (без цифр и символов).";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterOnlyLetters(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-Я]+"))
                .collect(Collectors.toList());
    }
}
