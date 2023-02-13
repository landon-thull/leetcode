package Strings.JewelsAndStones;

import java.util.HashSet;

public class NumJewelsInStones {
    // CODE FOR TESTCASES - NOT PART OF SOLUTION
    public static void main(String[] args) {
        String[] jTestcases = {"aA", "z"};
        String[] sTestcases = {"aAAbbbb", "ZZ"};

        for (int i = 0; i < jTestcases.length; i++) {
            System.out.println(numJewelsInStones(jTestcases[i], sTestcases[i]));
        }
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelList = new HashSet<>();
        int counter = 0;

        for (int i = 0; i < jewels.length(); i++) {
            jewelList.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jewelList.contains(stones.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }
}
