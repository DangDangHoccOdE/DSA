package Leetcode75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2215_Find_the_Difference_of_Two_Arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        for (int j : nums1) {
            set1.add(j);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        for (int j : nums2) {
            if (set1.contains(j)) {
                set1.remove(j);
                set2.remove(j);
            }
        }

        res.add(new ArrayList<>(set1));
        res.add(new ArrayList<>(set2));

        return res;
    }


}
