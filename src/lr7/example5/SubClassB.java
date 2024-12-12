package lr7.example5;

public class SubClassB extends SuperClass{

    protected char ch;

    SubClassB(String str, char ch) {
        super(str);
        this.ch = ch;
    }

    @Override
    public void printClassAndField() {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n"
                + " str = " + super.getStr() + "\n"
                + " ch = " + ch
        );
    }
}
