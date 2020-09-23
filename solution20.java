import java.util.Stack;

public class solution20 
{
    public static boolean isValid(String s) 
    {
        Stack<Character> sk = new Stack<Character>();  
        for (int i = 0; i < s.length(); i++) {  
            if (s.charAt(i) == '(') {  
                sk.push('(');  
            }  
            if (s.charAt(i) == ')') {  
                if (!sk.isEmpty() && sk.pop() == '(')  
                    continue;  
                else  
                    return false;  
            }  
            if (s.charAt(i) == '[') {  
                sk.push('[');  
            }  
            if (s.charAt(i) == ']') {  
                if (!sk.isEmpty() && sk.pop() == '[')  
                    continue;  
                else  
                    return false;  
            }  
            if (s.charAt(i) == '{') {  
                sk.push('{');  
            }  
            if (s.charAt(i) == '}') {  
                if (!sk.isEmpty() && sk.pop() == '{')  
                    continue;  
                else  
                    return false;  
            }  
        }  
        if (sk.isEmpty())  
            return true;  
        else  
            return false;  
    }
    public static void main(String[] args) 
    {
        System.out.println(isValid("(){}}{"));
    }
}
