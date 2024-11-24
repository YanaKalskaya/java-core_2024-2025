package lr5;

public class Example1Class {
    private char i;

    public void setSymbol(char value) {
        i = value;
    }
    public int getSymbolCode() {
        return (int) i;
    }
    public void printSymbol() {
        System.out.println("Символ: " + i + ". Его код: " + (int) i);
    }
}
