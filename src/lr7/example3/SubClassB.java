package lr7.example3;

public class SubClassB extends SubClassA {

    public String str;

    SubClassB(int num, char ch, String str) {
        super(num, ch);
        this.str = str;
    }

    public void setValue(int num, char ch, String str) {
        super.num = num;
        super.ch = ch;
        this.str = str;
    }

    @Override
    public String toString() {
        String str;
        str = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "num = " + this.num + "\n" +
                "ch = " + this.ch + "\n" +
                "str = " + this.str;
        return str;
    }
}
