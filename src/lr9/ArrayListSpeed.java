package lr9;

import java.util.ArrayList;

public class ArrayListSpeed {
    public static void main(String[] args) {
        int n = 100000;
        ArrayList<Integer> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int currentIndex = 0;
        long start = System.currentTimeMillis();
        while (people.size() > 1) {
            currentIndex = (currentIndex + 1) % people.size();
            people.remove(currentIndex);
        }
        long end = System.currentTimeMillis();
        System.out.println("Остался человек №" + people.get(0));
        System.out.print("Затраченное время: ");
        System.out.println(end - start);
    }
}
