public class A8_MaximumAverageSubarray_643{
    static public double findMaxSum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        // first four
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        maxSum = Math.max(sum, maxSum);
        
        for(int i=k;i<nums.length;i++){
        // next four
            sum = sum - nums[i-k] + nums[i];
            maxSum = Math.max(sum, maxSum);
        }
        
        return maxSum;
    }


    
    static public double findMaxSum2(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum += nums[j];
            }
           maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,12,-5,-6,50,3}, k = 3;
        System.out.println(findMaxSum(arr, k));
    }
}