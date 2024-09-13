public class _1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] a = {2,7,11,5};
        int[] b = twoSum(a, 9);

        for (int j : b) {
            System.out.println(j);
        }
        ;
    }
}