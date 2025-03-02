package lr9;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, "Число" + i);
        }

        System.out.println("Ключ > 5 у строк ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                System.out.println(map.values());
            }
        }
        if (map.containsKey(0)) {
            System.out.println("Ключ = 0: " + map.get(0));
        }

        int multi = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                multi *= entry.getKey();
            }
        }
        System.out.println("Произведение ключей с длиной строки > 5 = " + multi);
    }
}
