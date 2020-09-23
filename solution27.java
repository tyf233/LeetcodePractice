public class solution27 
{
    public static int removeElement(int[] nums, int val) 
    {
        int count = nums.length;
        int k = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[k] == val)
            {
                for (int j = k; j < nums.length - 1; j++)
                {
                    nums[j] = nums[j+1];
                }
                count--;
            }
            else 
            {
                
                k++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 2, 3};
        int len = removeElement(nums, 1);
        for (int i = 0; i < len; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
