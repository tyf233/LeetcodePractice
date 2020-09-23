import java.util.HashMap;
import java.util.Map;

public class solution1
{
    public static int[] twosum1(int[] nums, int target)  //遍历
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[j] == target - nums[i])
                {
                    return new int[] {i, j};
                }
            }
            
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twosum2(int[] nums, int target)  //两遍哈希表
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i)
            {
                return new int[] {i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twosum3(int[] nums, int target) //一遍哈希表
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i)
            {
                return new int[] {i, map.get(complement)};
            }
            else map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) 
    {
        int[] a = {1,2,3,4};
        int[] b = solution1.twosum1(a, 3);
        int[] c = solution1.twosum2(a, 4);
        int[] d = solution1.twosum3(a, 5);
        for (int i : b)
        {
            System.out.println(i);
        }

        for (int i : c)
        {
            System.out.println(i);
        }

        for (int i : d)
        {
            System.out.println(i);
        }
    }
}
