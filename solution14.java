public class solution14
{
    public static String longestCommonPrefix(String[] strs) 
    {
        int minstrs = 10000; //最小的长度
        StringBuilder NewSame = new StringBuilder();
        for (int i = 0; i < strs.length; i++)
        {
            if (strs[i].length() < minstrs) minstrs = strs[i].length();
        }
        for (int j = 0; j < minstrs; j++)
        {
            int count = 0;
            for (int i = 0; i < strs.length - 1; i++)
            {
                if (strs[i].charAt(j) == strs[i+1].charAt(j))   count++;
                else break;
            }
            if (count == strs.length - 1) NewSame.append(strs[count].charAt(j));
            else break;
        }
        String x = NewSame.toString();
        return x;
    }

    public static void main(String[] args) 
    {
        String[] test = {"abc", "bac"};
        //char x = test[0].charAt(1);
        System.out.println(longestCommonPrefix(test));
    }
}