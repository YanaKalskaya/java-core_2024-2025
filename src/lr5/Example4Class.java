package lr5;

public class Example4Class {
    char a;
    int b;
    Example4Class (int b, char a) {
        this.b = b;
        this.a = a;
    }
    Example4Class (double c) {
        String[] d = String.valueOf(c).split("\\.");
        this.b = Integer.parseInt(d[1].substring(0, 2));
        this.a = (char)(int)c;
    }
}
