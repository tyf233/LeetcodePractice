public class solution167 
{
    public static int[] twoSum(int[] numbers, int target) 
    {
        int result[] = new int[2];
        for (int i = 0; i < numbers.length; i++)
        {
            int first = numbers[i];
            for (int j = i+1; j < numbers.length; j++)
            {
                if (numbers[j] == target - first) 
                {
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 3, 4};
        for (int e : twoSum(a, 6))
            System.out.println(e);
    }
}
