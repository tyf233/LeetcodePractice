public class solution9
{
    public static boolean isPalindrome(int x) 
    {
        if (x < 0) return false;
        int w = 0; //存多少位
        int count = 0; 
        int y = x;
        while (x != 0)
        {
            
            x /= 10;
            w++;
        }
        int[] num = new int[w];
        for(int i = 0; i < w; i++)
        {
            num[i] = y % 10;   
            y /= 10;
        }
        for (int i = 0; i < w/2; i++)
        {
            if (num[i] == num[w - i - 1])  count++;
            
        }
        if (count == w/2)  return true;
        else return false;
        //throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) 
    {
        int x = 10;
        System.out.println(isPalindrome(x));
    }
}