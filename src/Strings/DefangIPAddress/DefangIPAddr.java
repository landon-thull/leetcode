package Strings.DefangIPAddress;

public class DefangIPAddr {
    public static void main(String[] args) {
        String[] testcases = {"1.1.1.1", "255.100.50.0"};

        for (String testcase : testcases) {
            System.out.println(defangIPAddr(testcase));
        }
    }

    public static String defangIPAddr(String address) {
        return address.replace(".", "[.]");
    }
}
