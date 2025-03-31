package Leetcode75;

public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i] == 0 && nums[j] != 0){
                    int a = nums[i];
                    nums[i] = nums[j];
                    nums[j] = a;
                    break;
                }
            }
        }
    }
}
