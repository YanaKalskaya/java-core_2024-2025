package lr7.example5;

public class SuperClass {

    private String str;

    SuperClass(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void printClassAndField() {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" + " str = " + str);
    }
}
