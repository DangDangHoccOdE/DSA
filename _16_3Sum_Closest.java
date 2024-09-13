public class _16_3Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        // Sap xep
        nums = sapXep(nums);
        int maxValue = Integer.MAX_VALUE;
        int result = 0;

        for(int i= 0 ;i<nums.length - 2 ; i++){
            int j = i+1;
            int k =nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }else if(sum>target) {
                    k--;
                }else{
                    j++;
                }
                int minSpace = Math.abs(sum-target);
                if(minSpace<maxValue){
                    maxValue = minSpace;
                    result = sum;
                }

            }
        }
        return result;
    }


    public static int[] sapXep(int[] nums){
        for(int i=0 ; i<nums.length-1;i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] x = {-1,2,1,-4};
        System.out.println(threeSumClosest(x,1));
    }
}
