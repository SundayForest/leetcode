package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 13 --- 14:24
 */
public class MaxProfit63 {
//    假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
            min = min > prices[i] ? prices[i] : min;
        }
        return profit;
    }
}
