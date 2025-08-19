import java.util.Arrays;

class Solution {
    static public int trap(int[] height) {
        int total = 0;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        int[] leftArr = new int[height.length];
        int[] rightArr = new int[height.length];

        for(int i=0;i<height.length;i++){
            if(leftMax<height[i]){
                leftMax = height[i];
            }
            leftArr[i] = leftMax;
        }

        for(int i=height.length-1;i>=0;i--){
            if(rightMax<height[i]){
                rightMax = height[i];
            }
            rightArr[i] = rightMax;
        }

        for(int i=0;i<height.length;i++){
            // min
            int minHeight = Math.min(leftArr[i], rightArr[i]);
            int currentWater = minHeight - height[i];
            if(currentWater > 0){
                total += currentWater;
            }
        }
        return total;
    }

    static public int trap2(int[] height) {
        int total = 0;
        // find each index
        for(int i=0;i<height.length;i++){
            // find leftMax
            int leftMax = Integer.MIN_VALUE;
            for(int left=0;left<=i;left++){
                leftMax = Math.max(leftMax,height[left]);
            }

            // find rightMax
            int rightMax = Integer.MIN_VALUE;
            for(int right=i;right<height.length;right++){
                rightMax = Math.max(rightMax, height[right]);
            }

            // current block water
            int currentWater = Math.min(rightMax, leftMax) - height[i];
            // total = (currentWater>0?currentWater:0)+total;
            if(currentWater > 0){
                total += currentWater;
            }
        }
        return total;
    }
}
public class A7_TrapWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(Solution.trap(arr)); // 6
    }
}
