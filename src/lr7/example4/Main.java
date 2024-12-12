package lr7.example4;

public class Main {
    public static void main(String[] args) {

        SuperClass superClassObject = new SuperClass('h');
        System.out.println(superClassObject.toString());
        SuperClass superClassObjectCopy = new SuperClass(superClassObject);
        System.out.println(superClassObjectCopy.toString());

        SubClassA subClassAObject = new SubClassA('i', "Hello!");
        System.out.println(subClassAObject.toString());
        SubClassA subClassAObjectCopy = new SubClassA(subClassAObject);
        System.out.println(subClassAObjectCopy.toString());

        SubClassB subClassBObject = new SubClassB('h', "Hi!", 6);
        System.out.println(subClassBObject.toString());
        SubClassB subClassBObjectCopy = new SubClassB(subClassBObject);
        System.out.println(subClassBObjectCopy.toString());
    }
}
