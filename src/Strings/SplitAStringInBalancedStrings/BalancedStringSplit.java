package Strings.SplitAStringInBalancedStrings;

public class BalancedStringSplit {
    // CODE FOR TESTCASES - NOT PART OF SOLUTION
    public static void main(String[] args) {
        String[] testcases = {"RLRRLLRLRL", "RLRRRLLRLL", "LLLLRRRR"};

        for (String testcase : testcases) {
            System.out.println(balancedStringSplit(testcase));
        }
    }

    public static int balancedStringSplit(String s) {
        int amt = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                amt++;
            }
        }

        return amt;
    }
}
