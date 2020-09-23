public class solution67 
{
    public static String addBinary(String a, String b) 
    {
        StringBuilder ans = new StringBuilder();
        int ca = 0;  //存放进位
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) 
        {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();   //逆置        
    }
    
    public static void main(String[] args) 
    {
        String a = "101";
        String b = "11";
        System.out.println(addBinary(a, b));
    }
}
