package lr6;

public class Example10Class {
    public static int[] getMinAndMax (int... nums) {
        int max = nums[0];
        int min = nums[0];

        for (int num: nums) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        int[] arrNums = {min, max};
        return arrNums;
    }
}
