package lr7.example2;

public class SuperClass {
    private String str1;

    SuperClass(String strEx) {
        this.str1 = strEx;
    }

    public void setValue(String str1) {
        this.str1 = str1;
    }

    public String getValue() {
        return str1;
    }

    public int getLengthOfStr() {
        return str1.length();
    }

    @Override
    public String toString() {
        String str;
        str = "superObject" + "\n" +
                " str 1 = " + this.getValue();
        return str;
    }
}
