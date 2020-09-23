public class solution136 
{
    public static int singleNumber(int[] nums) 
    {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
    
    public static void main(String[] args) 
    {
        int a[] = {1, 2, 2};
        System.out.println(singleNumber(a));
    }
}
