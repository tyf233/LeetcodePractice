import java.util.Scanner;

public class test
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] blood = new int[n*2];
        int[] hurt = new int[n*2];
        int[] count = new int[n*2];
        int sum = 0;
        int min = 10000;  
        
        for(int i = 0; i < 2*n; i++)
        {
            hurt[i]=input.nextInt();
        }
        for(int i = 0; i < 2*n; i++)
        {
            blood[i]=input.nextInt();
        }
        for(int i = 0; i < 2*n; i++)
        {
            count[i] = blood[i] - hurt[i];
        }
        for (int i = n - 1,  j = n  , k = 0; k < 2 * n; k++)
        { 
            
            if (count[i] > count[j])
            {
                sum += count[i];
                if(sum < min) min = sum;
                if (i == 0) 
                {
                    count[i] = -1000; 
                    continue;
                }
                i--;
            }    
            
            else 
            {
                sum += count[j];
                if(sum < min) min = sum;
                if (j == 2*n - 1) 
                {
                    count[j] = -1000;
                    continue;
                }
                j++;
            }
        }
        System.out.println(Math.abs(min)+1);
    }
}