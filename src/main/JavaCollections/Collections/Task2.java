import java.util.*;

public class Task2{
    static Scanner sc = new Scanner(System.in);

    static void st(int n){
        Stack<Integer> stack = new Stack<>();
        while(n > 0){
            stack.push(n % 10);
            n /= 10;
        }

        System.out.println("stack: "+stack);
        String s = stack.toString().replaceAll("\\[", "").replaceAll("]", "").replaceAll(", ", "");
        int number = Integer.parseInt(s);
        System.out.println(number);
    }

    public static void main(String[] args){
        System.out.println("Enter number");
        int InputNumber = sc.nextInt();
        st(InputNumber);
    }
}
