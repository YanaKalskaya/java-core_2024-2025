package lr5;

public class Example6Class {
    private int min, max;

    Example6Class (int val) {
        this.min = val;
        this.max = val;
    }
    Example6Class (int val1, int val2) {
        this.min = Math.min(val1, val2);
        this.max = Math.max(val1, val2);
    }
    public void setValue(int val) {
        this.min = Math.min(Math.min(min, val), max);
        this.max = Math.max(Math.max(max, val), min);
    }
    public void setValue(int val1, int val2) {
        this.min = Math.min(Math.min(Math.min(min, val1), val2), max);
        this.max = Math.max(Math.max(Math.max(max, val1), val2), min);
    }
    public void printValues() {
        System.out.println("min: " + this.min + "; max: " + this.max);
    }
}
