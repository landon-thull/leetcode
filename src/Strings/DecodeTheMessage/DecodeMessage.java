package Strings.DecodeTheMessage;


import java.util.HashMap;

public class DecodeMessage {
    // CODE FOR TESTCASES - NOT PART OF SOLUTION
    public static void main(String[] args) {
        String[] keys = {"the quick brown fox jumps over the lazy dog"};
        String[] messages = {"vkbs bs t suepuv"};

        for (int i = 0; i < keys.length; i++) {
            System.out.println(decodeMessage(keys[i], messages[i]));
        }

    }

    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < key.length() && i <= 26; i++) {
            if (key.charAt(i) != ' ') {
                map.put(key.charAt(i), (char) (97 + i));
            }
        }

        System.out.println(map);

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                out.append(map.get(message.charAt(i)));
            } else {
                out.append(' ');
            }
        }


        return out.toString();
    }
}
