package Leetcode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1431_Kids_With_the_Greatest_Number_of_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);

        int max=0;
        for (int i: candies) {
            if(max<i) max=i;
        }

        for (int candy : candies) {
            if (candy + extraCandies > max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a= {2,3,5,1,3};
        System.out.println(kidsWithCandies(a, 3));
    }
}
