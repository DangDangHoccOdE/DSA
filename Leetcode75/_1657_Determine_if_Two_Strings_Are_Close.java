package Leetcode75;

import java.util.*;

public class _1657_Determine_if_Two_Strings_Are_Close {
    // Cần check xem có cùng tập ký tự k
    // Cần check xem tần xuất xuất hiện có khớp nhau k
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i),0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i),0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()){
            if(!map2.containsKey(entry.getKey())){
                return false;
            }
        }

        // check thu tu tan suat
        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);
    }

    public static void main(String[] args) {
            String s1=  "abc";
            String s2 = "bca";
        System.out.println(closeStrings(s1,s2));
    }
}
