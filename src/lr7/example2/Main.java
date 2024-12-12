package lr7.example2;

public class Main {
    public static void main(String[] args) {

        SuperClass superClassObject = new SuperClass("суперкласс");
        System.out.println(superClassObject.toString());
        System.out.println(" strLength: " + superClassObject.getLengthOfStr());
        superClassObject.setValue("superclass");
        System.out.println(superClassObject.toString());

        SubClass subClassObject = new SubClass("подкласс",5);
        System.out.println(subClassObject.toString());
        System.out.println(" strLength: " + subClassObject.getLengthOfStr());
        subClassObject.setValue(6);
        System.out.println(subClassObject.toString());
        subClassObject.setValue("strChange", 7);
        System.out.println(subClassObject.toString());
    }
}
