package lr9.examples;

class Node { //КЛАСС - СТРУКТУРА ЭЛЕМЕНТА СПИСКА
    public int value; // значение
    public Node next; // поле - ссылка (указатель) на следующий узел
    Node(int value, Node next) { // конструктор класса
        this.value = value;
        this.next = next;
    }
}
