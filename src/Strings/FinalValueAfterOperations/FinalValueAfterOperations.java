package Strings.FinalValueAfterOperations;

public class FinalValueAfterOperations {

    // CODE FOR TESTCASES - NOT PART OF SOLUTION
    public static void main(String[] args) {
        String[][] testcases = {{"--X", "X++", "X++"}, {"++X", "++X", "X++"}};


        for (String[] testcase : testcases) {
            System.out.println(finalValueAfterOperations(testcase));
        }
    }

    public static int finalValueAfterOperations(String[] operations) {
        int counter = 0;

        for (String op : operations) {
            if (op.charAt(1) == '-') {
                counter--;
            } else {
                counter++;
            }
        }

        return counter;
    }
}
