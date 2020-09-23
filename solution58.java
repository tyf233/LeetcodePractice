public class solution58 
{
    public static int lengthOfLastWord(String s)
    {
        if (s.length() == 0) return 0;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) 
        {
        if (s.charAt(i) == ' ' && count != 0) return count;
        else if (s.charAt(i) == ' ') count = 0;
        else count ++;
        }
        return count;
    }
    
    public static void main(String[] args) 
    {
        String s = "abd acs";
        System.out.println(lengthOfLastWord(s));
    }
}
