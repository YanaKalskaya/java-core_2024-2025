package lr7.example5;

public class SubClassA extends SuperClass{

    public int num;

    SubClassA(String str, int num) {
        super(str);
        this.num = num;
    }
    @Override
    public void printClassAndField() {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n"
                + " str = " + super.getStr() + "\n"
                + " num = " + num
        );
    }

}
