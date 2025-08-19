public class A9_MinimumSizeSubarraySum{
    static public int minSubArrayLen(int target, int[] nums) {
        // 1 1 1 1 3 2 4 - 136
        int sum = 0; // 5
        int left = 0; // 2
        int min = Integer.MAX_VALUE;

        // 4
        for(int right=0;right<nums.length;right++){
            sum += nums[right];

            while(sum>=target){
                min = Math.min(min, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {
        int target = 7, nums[] = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(target, nums));
    }
}