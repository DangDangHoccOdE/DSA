public class _27_Remove_Element_2_con_tro {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

    }
}
