package Strings.MaximumNumberOfWordsFoundInSentences;

public class MostWordsFound {

    // CODE FOR TESTCASES - NOT PART OF SOLUTION
    public static void main(String[] args) {
        String[][] testcases = {
                {"alice and bob love leetcode", "i think so too", "this is great thanks very much"},
                {"please wait", "continue to fight", "continue to win"}
        };

        for (String[] testcase : testcases) {
            System.out.println(mostWordsFound(testcase));
        }
    }

    public static int mostWordsFound(String[] sentences) {
        int count = 1;

        for (String sentence : sentences) {
            int temp = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    temp++;
                }

            }
            count = Math.max((temp + 1), count);
        }

        return count;
    }
}
