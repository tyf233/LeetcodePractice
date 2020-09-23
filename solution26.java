public class solution26   //写的跟狗屎一样
{
    public static int removeDuplicates(int[] nums) 
    {
        int count = 0;           
        int i = 0;
        if (nums.length == 0) {return 0;}        
        for ( int k = 0; k < nums.length - 1; k++)
        {
            if (nums[i+1] == nums[i])
            {
                for (int j = i; j < nums.length - 1; j++)
                {
                    nums[j] = nums[j+1];
                }
                if (nums[i+1] == nums[i]) continue;
                else  
                {
                    count++;  
                    i++;  
                }          
            }
            else {i++;count++;}
        }
        return count+1;
    }
    

    public static void main(String[] args) 
    {
        int[] test = {1, 2, 3};
        removeDuplicates(test);
    }
}