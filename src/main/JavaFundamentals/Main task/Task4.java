import java.util.*;
class Main
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int MathNumber = sc.nextInt();
		int MathArr[] = new int[MathNumber];
		int sum = 0;
		int multiply = 1;
		for(int i = 0; i < MathNumber; i++){
			MathArr[i] = sc.nextInt();
			System.out.print(MathArr[i] + " ");
			sum += MathArr[i];
			multiply *= MathArr[i];
		}
		System.out.print('\n' + "Sum: " + sum + '\n');
		System.out.print("Multiplication: " + multiply);
	}
}
