public class solution28 
{
    public static int strStr(String haystack, String needle) 
    {
        if (needle.length() == 0) return 0;
        int j = 0;
        int i = 0;

        while (i < haystack.length())
        {
            if (haystack.charAt(i) == needle.charAt(j))
            {
                j++;
            }
            else 
            { 
                i = i - j;
                j = 0;
            }
            i++;

            if (j == needle.length()) return i - j;
        }
        return -1; 
    }
    
    public static void main(String[] args) {
        String a = "mississippi";
        String b = "issip";
        System.out.println(strStr(a, b));
    }
}
