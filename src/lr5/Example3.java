package lr5;

public class Example3 {
    public static void main(String[] args) {
        Example3Class nul = new Example3Class();
        System.out.println(nul.a + " " + nul.b);
        Example3Class one = new Example3Class(5);
        System.out.println(one.a + " " + one.b);
        Example3Class two = new Example3Class(5, 8);
        System.out.println(two.a + " " + two.b);
    }
}
