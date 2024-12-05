package lr6;

public class Example1Class {
    private char ch;
    private String str;

    public void setValue(char ch) {
        this.ch = ch;
    }
    public void setValue(String str) {
        this.str = str;
    }
    public void setValue(char[] arr) {
        if (arr.length == 1) {
            this.ch = arr[0];
        } else {
            String newStr = "";
            for (char ch: arr) {
                newStr += ch;
            }
            this.str = newStr;
        }
    }
    public void printValues() {
        System.out.println("ch: " + this.ch + ", str: " + this.str);
    }
}
