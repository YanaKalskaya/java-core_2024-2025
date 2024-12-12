package lr7.example2;

public class SubClass extends SuperClass {

    public int num;

    SubClass(String strEx, int numEx) {
        super(strEx);
        this.num = numEx;
    }

    public void setValue() {
        super.setValue("");
        this.num = 0;
    }

    @Override
    public void setValue(String str1) {
        super.setValue(str1);
    }

    public void setValue(int numEx) {
        this.num = numEx;
    }

    public void setValue(String str1, int numEx) {
        super.setValue(str1);
        this.num = numEx;
    }

    @Override
    public String toString() {
        String str;
        str = "subObject" + "\n" +
                " num = " + this.num + "\n" +
                " str 1 = " + this.getValue();
        return str;
    }
}
