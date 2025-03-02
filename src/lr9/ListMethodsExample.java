package lr9;

public class ListMethodsExample {
    public static void main(String[] args) {
        ListMethods list = new ListMethods();

        // Методы с циклом
        System.out.println("Создание списка с головы:");
        list.createHead(5);
        System.out.println(list.toString()); // 5 4 3 2 1

        System.out.println("\nСоздание списка с хвоста:");
        list.createTail(5);
        System.out.println(list); // 1 2 3 4 5

        System.out.println("\nДобавление в начало:");
        list.addFirst(0);
        System.out.println(list); // 0 1 2 3 4 5

        System.out.println("\nДобавление в конец:");
        list.addLast(6);
        System.out.println(list); // 0 1 2 3 4 5 6

        System.out.println("\nВставка элемента:");
        list.insert(99, 3);
        System.out.println(list); // 0 1 2 99 3 4 5 6

        System.out.println("\nУдаление первого элемента:");
        list.removeFirst();
        System.out.println(list); // 1 2 99 3 4 5 6

        System.out.println("\nУдаление последнего элемента:");
        list.removeLast();
        System.out.println(list); // 1 2 99 3 4 5

        System.out.println("\nУдаление элемента:");
        list.remove(3);
        System.out.println(list); // 1 2 99 4 5

        // Рекурсивные методы
        System.out.println("\nСоздание списка с головы (рекурсия):");
        list.createHeadRec(5);
        System.out.println(list.toStringRec()); // 5 4 3 2 1

        System.out.println("\nСоздание списка с хвоста (рекурсия):");
        list.createTailRec(5);
        System.out.println(list.toStringRec()); // 1 2 3 4 5
    }
}
