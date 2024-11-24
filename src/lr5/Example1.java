package lr5;

public class Example1 {
    public static void main(String[] args) {
        Example1Class a =  new Example1Class();
        a.setSymbol('a');
        System.out.println("Код символа: " + a.getSymbolCode());
        a.printSymbol();
    }
}
