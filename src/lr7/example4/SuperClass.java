package lr7.example4;

public class SuperClass {

    public char ch;

    SuperClass(char ch) {
        this.ch = ch;
    }

    SuperClass(SuperClass obj) {
        this.ch = obj.ch;
    }

    @Override
    public String toString() {
        String str;
        str = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "ch = " + this.ch;
        return str;
    }
}
