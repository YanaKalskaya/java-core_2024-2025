package lr7.example5;

public class Main {
    public static void main(String[] args) {

        SuperClass superObject = new SuperClass("строка");
        SubClassA subAObject = new SubClassA("объект А", 5);
        SubClassB subBObject = new SubClassB("объект B", 'g');

        superObject.printClassAndField();
        subAObject.printClassAndField();
        subBObject.printClassAndField();

        SuperClass per = subAObject;
        per.printClassAndField();

    }
}
