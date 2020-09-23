public class solution53 
{
    public static int sum(int[] nums, int a, int b)
    {
        int count = 0;
        for (int i = a; i <= b; i++)
        {
            count = count + nums[i];
        }
        return count;
    }

    public static int maxSubArray1(int[] nums)  //遍历真的太慢了
    {
        int count = -10000;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i; j < nums.length; j++)
            {
                if(sum(nums, i, j) > count)  count = sum(nums, i, j);
            }
        }
        return count;
    }
    public static int maxSubArray2(int[] nums) 
    {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);  //到x为止的数组之和最大值
            maxAns = Math.max(maxAns, pre);  //比较pre的值
        }
        return maxAns;
    }
    
    public static void main(String[] args) 
    {
        int[] nums = {-2, -1};
        System.out.println(maxSubArray2(nums));    
    }
}
