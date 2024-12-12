package lr7.example4;

public class SubClassB extends SubClassA {

    public int num;

    SubClassB(char ch, String str, int num) {
        super(ch, str);
        this.num = num;
    }

    SubClassB(SubClassB obj) {
        super(obj.ch, obj.str);
        this.num = obj.num;
    }

    @Override
    public String toString() {
        String str;
        str = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str = " + this.str + "\n" +
                "num = " + this.num + "\n" +
                "ch = " + this.ch;
        return str;
    }
}
