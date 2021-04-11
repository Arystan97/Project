import java.util.*;

public class Task7{
    static boolean areBracketsBalanced(String expr){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
            if(x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                }
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args)
    {
        String expr = "([{}])";

        if (areBracketsBalanced(expr))
            System.out.println("Correct ");
        else
            System.out.println("Not correct ");
    }
}