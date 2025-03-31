package Leetcode75;

import java.util.ArrayList;

public class _151_Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        ArrayList<String> res = new ArrayList<>();

        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            res.add(words[i]);
        }

        return String.join(" ", res);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
