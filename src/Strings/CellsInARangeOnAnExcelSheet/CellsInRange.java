package Strings.CellsInARangeOnAnExcelSheet;


import java.util.ArrayList;
import java.util.List;

public class CellsInRange {
    // CODE FOR TESTCASES - NOT PART OF SOLUTION
    public static void main(String[] args) {
        String[] testcases = {"K1:L2", "A1:F1"};

        for (String testcase : testcases) {
            System.out.println(cellsInRange(testcase));
        }
    }

    public static List<String> cellsInRange(String s) {
        List<String> out = new ArrayList<>();

        char startC = s.charAt(0);
        char endC = s.charAt(3);
        int startI = s.charAt(1);
        int endI = s.charAt(4);

        while (startC <= endC) {
            for (int i = startI; i <= endI; i++) {
                out.add(startC + "" + (i - 48));
            }

            startC = (char) (startC + 1);
        }

        return out;

    }
}
