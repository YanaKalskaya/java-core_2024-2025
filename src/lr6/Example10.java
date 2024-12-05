package lr6;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 7, 3, 1};
        int[] result = Example10Class.getMinAndMax(numbers);

        System.out.println(Arrays.toString(result));
    }
}
