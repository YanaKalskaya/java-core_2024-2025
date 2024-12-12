package lr7.example4;

public class SubClassA extends SuperClass {

    public String str;

    SubClassA(char ch, String str) {
        super(ch);
        this.str = str;
    }

    SubClassA(SubClassA obj) {
        super(obj.ch);
        this.str = obj.str;
    }

    @Override
    public String toString() {
        String str;
        str = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "ch = " + this.ch + "\n" +
                "str = " + this.str;
        return str;
    }

}
