package lr6;

public class Example1 {
    public static void main(String[] args) {
        Example1Class obj = new Example1Class();
        obj.setValue('s');
        obj.printValues();
        obj. setValue("Hello");
        obj.printValues();
        obj.setValue(new char[]{'f'});
        obj.printValues();
        obj.setValue(new char[]{'p', 'r', 'i', 'v', 'e', 't'});
        obj.printValues();
    }
}
