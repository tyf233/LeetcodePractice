public class solution292 
{
    public static boolean canWinNim(int n) 
    {
        return (n % 4 != 0);
    }
    public static void main(String[] args) 
    {
        System.out.println(canWinNim(8));
    }
}
