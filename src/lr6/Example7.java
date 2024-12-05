package lr6;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        char[] array = {'h', 'e', 'l', 'l', 'o'};
        int[] codes = Example7Class.getCodesOfSymbols(array);
        System.out.println(Arrays.toString(codes));
    }
}
