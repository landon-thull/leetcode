package Strings.ShuffleString;

public class RestoreString {
    // CODE FOR TESTCASES - NOT PART OF SOLUTION
    public static void main(String[] args) {
        String[] sTestcases = {"codeleet", "abc"};
        int[][] iTestcases = {{4,5,6,7,0,2,1,3}, {0,1,2}};

        for (int i = 0; i < sTestcases.length; i++) {
            System.out.println(restoreString(sTestcases[i], iTestcases[i]));
        }
    }

    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            chars[indices[i]] = s.charAt(i);
        }

        return new String(chars);
    }
}
