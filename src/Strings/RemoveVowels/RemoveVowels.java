package Strings.RemoveVowels;

public class RemoveVowels {

    // View explanation
    public static void main(String[] args) {
        String[] testcases = {"leetcodeisacommunityforcoders", "aeiou"};

        for (String testcase : testcases) {
            System.out.println(removeVowels(testcase));
        }
    }

    public static String removeVowels(String s) {
        StringBuffer sb = new StringBuffer(s.length());

        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


}
