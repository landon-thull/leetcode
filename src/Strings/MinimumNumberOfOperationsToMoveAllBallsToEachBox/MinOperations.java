package Strings.MinimumNumberOfOperationsToMoveAllBallsToEachBox;

import java.util.ArrayList;
import java.util.Arrays;

public class MinOperations {
    // CODE FOR TESTCASES - NOT PART OF SOLUTION
    public static void main(String[] args) {
        String[] testcases = {"110", "001011"};

        for (String testcase : testcases) {
            System.out.println(Arrays.toString(minOperations(testcase)));
        }
    }

    public static int[] minOperations(String boxes) {
        int[] out = new int[boxes.length()];
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                indexes.add(i);
            }
        }

        for (int i = 0; i < boxes.length(); i++) {
            int tempTotal = 0;

            for (int index : indexes) {
                tempTotal += Math.abs(index - i);
            }

            out[i] = tempTotal;
        }

        return out;

    }
}
