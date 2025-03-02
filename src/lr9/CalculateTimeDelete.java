package lr9;

import java.util.*;

public class CalculateTimeDelete {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(100, 0.75f);

        System.out.println("Время выполнения операции удаления");

        System.out.println("в начале списка: ");
        System.out.println("для arrayList = " + getTimeForOperation(CalculateTimeDelete::deleteFirst, arrayList, null) + " ms");
        System.out.println("для linkedList = " + getTimeForOperation(CalculateTimeDelete::deleteFirst, linkedList, null) + " ms");
        System.out.println("для treeSet = " + getTimeForOperation(CalculateTimeDelete::deleteFirst, treeSet, null) + " ms");
        System.out.println("для linkedHashMap = " + getTimeForOperation(CalculateTimeDelete::deleteFirst, null, linkedHashMap) + " ms");

        System.out.println("в середине списка: ");
        System.out.println("для arrayList = " + getTimeForOperation(CalculateTimeDelete::deleteMiddle, arrayList, null) + " ms");
        System.out.println("для linkedList = " + getTimeForOperation(CalculateTimeDelete::deleteMiddle, linkedList, null) + " ms");
        System.out.println("для treeSet = " + getTimeForOperation(CalculateTimeDelete::deleteMiddle, treeSet, null) + " ms");
        System.out.println("для linkedHashMap = " + getTimeForOperation(CalculateTimeDelete::deleteMiddle, null, linkedHashMap) + " ms");

        System.out.println("в конце списка: ");
        System.out.println("для arrayList = " + getTimeForOperation(CalculateTimeDelete::deleteEnd, arrayList, null) + " ms");
        System.out.println("для linkedList = " + getTimeForOperation(CalculateTimeDelete::deleteEnd, linkedList, null) + " ms");
        System.out.println("для treeSet = " + getTimeForOperation(CalculateTimeDelete::deleteEnd, treeSet, null) + " ms");
        System.out.println("для linkedHashMap = " + getTimeForOperation(CalculateTimeDelete::deleteEnd, null, linkedHashMap) + " ms");
    }

    private static final int countElements = 4_000_000;

    public interface getTimeFunc {
        void action(Collection<Integer> collection, Map<String, Integer> map);
    }

    private static long getTimeForOperation(getTimeFunc func, Collection<Integer> collection, Map<String, Integer> map) {
        if (collection != null) {
            collection.clear();
        } else if (map != null) {
            map.clear();
        }
        long start = System.currentTimeMillis();
        func.action(collection, map);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static void deleteFirst(Collection<Integer> collection, Map<String, Integer> map) {
        if (collection != null) {
            for (int i = 0; i < countElements; i++) {
                collection.remove(0);
            }
        } else if (map != null) {
            for (int i = 0; i < countElements; i++) {
                if (!map.isEmpty()) {
                    Map.Entry<String, Integer> firstEntry = map.entrySet().iterator().next();
                    map.remove(firstEntry.getKey());
                }
            }
        }
    }

    private static void deleteMiddle(Collection<Integer> collection, Map<String, Integer> map) {
        if (collection != null) {
            for (int i = 0; i < countElements; i++) {
                collection.remove(collection.size() / 2);
            }
        } else if (map != null) {
            for (int i = 0; i < countElements; i++) {
                int currentIndex = 0;
                String keyToRemove = "";
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (currentIndex == map.size() / 2) {
                        keyToRemove = entry.getKey();
                        break;
                    }
                    currentIndex++;
                }
                if (keyToRemove != null) {
                    map.remove(keyToRemove);
                }
            }
        }
    }

    private static void deleteEnd(Collection<Integer> collection, Map<String, Integer> map) {
        if (collection != null) {
            for (int i = 0; i < countElements; i++) {
                collection.remove(collection.size() - 1);
            }
        } else if (map != null) {
            for (int i = 0; i < countElements; i++) {
                String lastKey = null;
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    lastKey = entry.getKey();
                }
                if (lastKey != null) {
                    map.remove(lastKey);
                }
            }
        }
    }
}


