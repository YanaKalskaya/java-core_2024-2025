package lr5;

public class Example5 {
    public static void main(String[] args) {
        Example5Class nul = new Example5Class();
        System.out.print(nul.getA() + " ");
        nul.setA(5);
        System.out.print(nul.getA() + " ");
        System.out.println(" ");
        Example5Class one = new Example5Class(7);
        System.out.print(one.getA() + " ");
        one.setA();
        System.out.print(one.getA() + " ");
        System.out.println(" ");
    }
}
