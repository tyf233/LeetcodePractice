public class solution169 
{
    public static int majorityElement(int[] nums) 
    {
        int count = 0;
        int x;
        if (nums.length%2 == 0) x = nums.length/2;
        else x = nums.length/2 + 1;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[i] == nums[j]) count++;
            }
            if (count >= x) return nums[i];
            else count = 0;
        }
        throw new IllegalArgumentException("No major");
    }
    public static void main(String[] args) 
    {
        int[] a = {1};
        System.out.println(majorityElement(a));
    }    
}
