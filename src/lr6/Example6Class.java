package lr6;

public class Example6Class {
    public static int[] getNElments(int[] arr, int num) {
        if (num >= arr.length) {
            int[] newArr = new int[arr.length];
            for(int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        } else {
            int[] newArr = new int[num ];
            for(int i = 0; i < num; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        }
    }
}
