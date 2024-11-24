package lr5;

public class Example6 {
    public static void main(String[] args) {
        Example6Class val = new Example6Class(5);
        val.printValues();
        val.setValue(3, 9);
        val.printValues();
        Example6Class val2 = new Example6Class(10, 3);
        val2.printValues();
        val2.setValue(6, 12);
        val2.printValues();
        val2.setValue(2);
        val2.printValues();
    }
}
