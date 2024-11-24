package lr5;

public class Example5Class {
    private int a;
    Example5Class () {
        this.a = 0;
    }
    Example5Class (int a) {
        this.a = Math.min(a, 100);
    }
    public void setA () {
        this.a = 0;
    }
    public void setA (int a) {
        if (a > 100) {
            this.a = 100;
        } else {
            this.a = a;
        }
    }
    public int getA () {
        return a;
    }
}
