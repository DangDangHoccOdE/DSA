package Leetcode75;

import java.util.HashSet;
import java.util.Set;

public class _1456_Maximum_Number_of_Vowels_in_a_Substring {
    public static int maxVowels(String s, int k) {
        // Kĩ thuật sliding window:
        int maxCount = 0;
        int count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for(int i = 0 ; i< k ; i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
        }

        maxCount = Math.max(maxCount, count);

        for(int i = k ; i<s.length() ; i++){
            if(vowels.contains(s.charAt(i-k))){
                count--;
            }
            if(vowels.contains(s.charAt(i))){
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou", 7));
    }
}
