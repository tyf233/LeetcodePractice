public class solution168 
{
    public static String convertToTitle(int n) 
    {
        StringBuilder a = new StringBuilder();
        int yu;
        char c; 
        while (n != 0)
        {
            yu = n % 26;
            n = n / 26;
            if (yu == 0)
            {
                c = 'Z';
                n -= 1;
            }
            else
                c = (char) (yu + 64);
            a.append(c);
        }
        a.reverse();
        String b = a.toString();
        return b;
    }
    public static void main(String[] args) 
    {
        char a = 65;
        System.out.println(a);
        int x = 52;
        System.out.println(convertToTitle(x));
    }    
}
