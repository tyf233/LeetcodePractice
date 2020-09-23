public class solution35
{
    public static int searchInsert(int[] nums, int target) 
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            
            if (nums[i] == target) 
            {
                return i; 
            }
            if (target > nums[i])  
            {
                count++;
            }
        }
        return count;
    }  
    public static void main(String[] args) 
    {
        int[] nums = {1, 2, 3, 5};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }
}
