package lr6;

public class Example6 {
    public static void main(String[] args) {
        int[] newArr = Example6Class.getNElments(new int[] {2,6,4,7,8}, 3);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        newArr = Example6Class.getNElments(new int[] {2,6,4,7,8}, 8);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
