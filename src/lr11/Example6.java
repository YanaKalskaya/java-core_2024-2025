package lr11;

import java.util.*;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, на которое должны делиться фильтруемые элементы: ");
        int num = in.nextInt();

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterDivEntirely(integers, num);

        System.out.println("\n" + "Список после фильтрации: " + "\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }

    }

    public static List<Integer> filterDivEntirely(List<Integer> list, int num) {
        return list.stream().filter(x -> x % num == 0).collect(Collectors.toList());
    }
}
