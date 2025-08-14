
public class A6_StockProfit {
    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(minVal > prices[i]){
                minVal = prices[i];
            }
            int cProfit = prices[i] - minVal;
            maxProfit = maxProfit < cProfit?cProfit:maxProfit;
        }
        return maxProfit;
    }
}
