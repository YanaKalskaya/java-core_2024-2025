package lr9;

import java.util.*;

public class CalculateTimeAdd {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(100, 0.75f);

        System.out.println("Время выполнения операции добавления");

        System.out.println("в начало списка: ");
        System.out.println("для arrayList = " + getTimeForOperation(CalculateTimeAdd::addFirst, arrayList, null) + " ms");
        System.out.println("для linkedList = " + getTimeForOperation(CalculateTimeAdd::addFirst, linkedList, null) + " ms");
        System.out.println("для treeSet не доступно");
        System.out.println("для linkedHashMap не доступно");

        System.out.println("в середину списка: ");
        System.out.println("для arrayList = " + getTimeForOperation(CalculateTimeAdd::addMiddle, arrayList, null) + " ms");
        System.out.println("для linkedList = " + getTimeForOperation(CalculateTimeAdd::addMiddle, linkedList, null) + " ms");
        System.out.println("для treeSet не доступно");
        System.out.println("для linkedHashMap не доступно");

        System.out.println("в конец списка: ");
        System.out.println("для arrayList = " + getTimeForOperation(CalculateTimeAdd::addEnd, arrayList, null) + " ms");
        System.out.println("для linkedList = " + getTimeForOperation(CalculateTimeAdd::addEnd, linkedList, null) + " ms");
        System.out.println("для treeSet = " + getTimeForOperation(CalculateTimeAdd::addEnd, treeSet, null) + " ms");
        System.out.println("для linkedHashMap = " + getTimeForOperation(CalculateTimeAdd::addEnd, null, linkedHashMap) + " ms");
    }

    private static final int countElements = 4_000_000;

    public interface getTimeFunc {
        void action(Collection<Integer> collection, Map<String, Integer> map);
    }

    private static long getTimeForOperation(getTimeFunc func, Collection<Integer> collection, Map<String, Integer> map) {
        if(collection != null) {
            collection.clear();
        } else if (map != null) {
            map.clear();
        }
        long start = System.currentTimeMillis();
        func.action(collection, map);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static void addFirst(Collection<Integer> collection, Map<String, Integer> map) {
        for (int i = 0; i < countElements; i++) {
            if (collection instanceof ArrayList) {
                ((ArrayList) collection).add(0, i);
            } else if (collection instanceof LinkedList) {
                ((LinkedList) collection).add(0, i);
            }
        }
    }

    private static void addMiddle(Collection<Integer> collection, Map<String, Integer> map) {
        if (collection instanceof ArrayList) {
            for (int i = 0; i < countElements; i++) {
                ((ArrayList) collection).add(collection.size() / 2, i);
            }
        } else if (collection instanceof LinkedList) {
            LinkedList<Integer> list = (LinkedList<Integer>) collection;
            ListIterator<Integer> iterator = list.listIterator(list.size() / 2);
            for (int i = 0; i < countElements; i++) {
                iterator.add(i);
            }
        }
    }

    private static void addEnd(Collection<Integer> collection, Map<String, Integer> map) {
        if (collection != null) {
            for (int i = 0; i < countElements; i++) {
                collection.add(i);
            }
        } else if (map != null) {
            for (int i = 0; i < countElements; i++) {
                map.put("Строка", i);
            }
        }

    }
}

