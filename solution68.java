public class solution68 
{
    public static int mySqrt(int x) 
    {
        long i = 0;
        long y = (long) x;
        while (i < y)
        {
            if(i * i  <= y && (i+1) * (i+1) > y)
                break;
            i++;
        }
        return (int)i;
    }

    public static void main(String[] args)
    {
        int x = 2147395600;
        System.out.println(mySqrt(x));
    }
}
