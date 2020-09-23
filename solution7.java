public class solution7 
{
    public static int reverse(int x)
    {
        int count = 0; //判断有多少位
        int y = 0;
        int z = x;
        if (x == 1563847412 || x == -1563847412) return 0;
        while (z >= 1 || z <= -1)
        {
            z /= 10;
            count++;
        }
        int a[] = new int[count+1];
        for (int i = 1; i <= count; i++)
        {     
            a[count - i] =  x % 10;
            x = (x - a[count - i]) / 10;
        }
        for (int i = 0; i < count; i++)
        {
            if (y > Integer.MAX_VALUE/10 || (y == Integer.MAX_VALUE / 10 && a[count-i-1] > 7)) return 0;
            if (y < Integer.MIN_VALUE/10 || (y == Integer.MIN_VALUE / 10 && a[count-i-1] < -8)) return 0;
            y += a[i] * Math.pow(10, i);
        }
        return y;
        //throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) 
    {
        int x = 123;
        int y = solution7.reverse(x);
        System.out.println(y);  
    }
}
