package Leetcode75;

public class _724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        // tính tổng
        // sumLeft = sumTotal - sumLeft - nums[i]
        int sumTotal = 0;
        for(int x : nums){
            sumTotal += x;
        }

        int sumLeft = 0;
        for(int i=0 ; i< nums.length ; i++){
            if(sumTotal - sumLeft - nums[i] == sumLeft){
                return i;
            }
            sumLeft += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
