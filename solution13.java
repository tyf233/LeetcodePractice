public class solution13
{
    public static int romanToInt (String s)
    {
        int count = 0; //整体的数量
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'I') count += 1;
            else if (s.charAt(i) == 'V') count += 5;
            else if (s.charAt(i) == 'X') count += 10;
            else if (s.charAt(i) == 'L') count += 50;
            else if (s.charAt(i) == 'C') count += 100;
            else if (s.charAt(i) == 'D') count += 500;
            else if (s.charAt(i) == 'M') count += 1000;
            else System.out.println("error");
        }
        for (int i = 0; i < s.length() - 1; i++)
        {
            if (s.charAt(i) == 'I' && s.charAt(i+1) == 'V') count -= 2;
            if (s.charAt(i) == 'I' && s.charAt(i+1) == 'X') count -= 2;
            if (s.charAt(i) == 'X' && s.charAt(i+1) == 'L') count -= 20;
            if (s.charAt(i) == 'X' && s.charAt(i+1) == 'C') count -= 20;
            if (s.charAt(i) == 'C' && s.charAt(i+1) == 'D') count -= 200;
            if (s.charAt(i) == 'C' && s.charAt(i+1) == 'M') count -= 200;
        }
        //throw new IllegalArgumentException("No two sum solution");
        return count;
    }

    public static void main (String[] args)
    {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
