package lr7.example3;

public class SuperClass {

    public int num;

    SuperClass(int num) {
        this.num = num;
    }

    public void setValue(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        String str;
        str = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "num = " + this.num;
        return str;
    }
}
