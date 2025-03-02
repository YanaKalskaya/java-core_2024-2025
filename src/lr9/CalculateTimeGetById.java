package lr9;

import java.util.*;

public class CalculateTimeGetById {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(100, 0.75f);

        for (int i = 0; i < 4_000_000; i++) arrayList.add(i);
        for (int i = 0; i < 4_000_000; i++) linkedList.add(i);
        for (int i = 0; i < 4_000_000; i++) linkedHashMap.put("Строка", i);

        System.out.println("Время выполнения операции получения элемента по индексу");
        System.out.println("для arrayList = " + getTimeForOperation(CalculateTimeGetById::getById, arrayList, null) + " ms");
        System.out.println("для linkedList = " + getTimeForOperation(CalculateTimeGetById::getById, linkedList, null) + " ms");
        System.out.println("для treeSet не поддерживается");
        System.out.println("для linkedHashMap = " + getTimeForOperation(CalculateTimeGetById::getById, null, linkedHashMap) + " ms");
    }

    private static final int countElements = 4_000_000;

    public interface getTimeFunc {
        void action(Collection<Integer> collection, Map<String, Integer> map);
    }

    private static long getTimeForOperation(getTimeFunc func, Collection<Integer> collection, Map<String, Integer> map) {
        long start = System.currentTimeMillis();
        func.action(collection, map);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static void getById(Collection<Integer> collection, Map<String, Integer> map) {
        if (collection instanceof ArrayList) {
            ((ArrayList) collection).get(countElements / 2);
        } else if (collection instanceof LinkedList) {
            ((LinkedList) collection).get(countElements / 2);
        } else if (map != null) {
            map.get(countElements / 2);
        }
    }
}


