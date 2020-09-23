public class solution88 
{
    public static void merge(int[] nums1, int m, int[] nums2, int n)  //错误，不要作死
    {
        if (m == 0) 
        {
            for (int i = 0; i < n; n++)
            {
                nums1[i] = nums2[i];
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = m + i - 1; j >= 0; j--)
            {
                if (nums2[i] >= nums1[j])
                {
                    for (int k = m + n - 1; k >= j + i + 1; k--)
                        nums1[k] = nums1[k - 1];
                    nums1[j + 1] = nums2[i];
                    break;
                }
            }  
        }
    }
    
    public static void main(String[] args) 
    {
        int[] nums1 = {1, 0};
        int[] nums2 = {2};
        int m = 1;
        int n = 1;
        merge(nums1, m, nums2, n);
        for (int e : nums1)
        System.out.println(e);
    }
}
