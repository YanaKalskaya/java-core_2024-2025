package lr7.example3;

public class Main {
    public static void main(String[] args) {

        SuperClass superClassObject = new SuperClass(1);
        System.out.println(superClassObject.toString());

        SubClassA subClassAObject = new SubClassA(4, 'f');
        System.out.println(subClassAObject.toString());

        SubClassB subClassBObject = new SubClassB(5, 'h', "Hi!");
        System.out.println(subClassBObject.toString());
    }
}
