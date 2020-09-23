public class solution121 
{
    public static int maxProfit(int[] prices) 
    {
        int len = prices.length;
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            for (int j = i+1; j < len; j++)
            {
                if (prices[j] - prices[i] > count) count = prices[j] - prices[i];
            }
        }
        return count;
    }
    
    public static void main(String[] args) 
    {
        int[] a = {1, 0};
        System.out.println(maxProfit(a));
    }
}
