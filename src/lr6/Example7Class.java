package lr6;

public class Example7Class {
    public static int[] getCodesOfSymbols(char[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (int) array[i];
        }
        return result;
    }
}
