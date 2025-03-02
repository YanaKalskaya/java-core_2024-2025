package lr9;

import java.util.LinkedList;

public class LinkedListSpeed {
    public static void main(String[] args) {
        int n = 100000;
        LinkedList<Integer> people = new LinkedList<>();

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
