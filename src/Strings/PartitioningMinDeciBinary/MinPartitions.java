package Strings.PartitioningMinDeciBinary;

public class MinPartitions {

    // CODE FOR TESTCASES - NOT PART OF SOLUTION
    public static void main(String[] args) {
        String[] testcases = {"32", "82734", "27346209830709182346"};

        for (String testcase : testcases) {
            System.out.println(minPartitions(testcase));
        }
    }

    public static int minPartitions(String n) {
        int highest = 0;

        for (int i = 0; i < n.length(); i++) {
            if (highest < (n.charAt(i) - '0')) {
                highest = n.charAt(i) - '0';
            }
        }

        return highest;
    }
}
