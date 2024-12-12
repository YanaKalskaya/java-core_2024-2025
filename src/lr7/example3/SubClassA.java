package lr7.example3;

public class SubClassA extends SuperClass {

    public char ch;

    SubClassA(int num, char ch) {
        super(num);
        this.ch = ch;
    }

    public void setValue(int num, char ch) {
        super.num = num;
        this.ch = ch;
    }

    @Override
    public String toString() {
        String str;
        str = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "num = " + this.num + "\n" +
                "ch = " + this.ch;
        return str;
    }

}
