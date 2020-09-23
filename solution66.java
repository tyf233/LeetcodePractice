public class solution66 
{
    public static int[] plusOne(int[] digits) 
    {
        int count = 0;
        int len = digits.length;
        int[] anArray = new int[digits.length + 1];
        if (digits[len - 1] != 9) 
        {
            digits[len - 1] = digits[len - 1] + 1;
            return digits;
        }
        else
        {
            for (int i = len - 1; i >= 0; i--)
            {
                if (digits[i] == 9) count++;
                else break;
            }  
        }
        if (count == len)
        {
            for (int i = 1; i < len; i++)
            {
                anArray[i] = 0;
            }
            anArray[0] = 1;
            return anArray;
        }
        else 
        {
            for (int i = len - 1, j = 0; j < count; i--,j++)
            {
                digits[i] = 0;
            }
            digits[len - 1 - count] = digits[len - 1 - count] + 1;
            return digits;
        }
    }    

    public static void main(String[] args) 
    {
        int[] digits = {9, 9, 9, 9};
        for (int e  : plusOne(digits))
            System.out.println(e);
    }
}
