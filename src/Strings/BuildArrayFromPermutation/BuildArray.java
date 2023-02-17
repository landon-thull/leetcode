package Strings.BuildArrayFromPermutation;

import java.util.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        int[][] testcases = {{0,2,1,5,3,4}};

        for (int[] testcase : testcases) {
            System.out.println(Arrays.toString(buildArray(testcase)));
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] out = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            out[i] = nums[nums[i]];
        }

        return out;
    }
}
