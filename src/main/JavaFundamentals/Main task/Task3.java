import java.util.*;
class Main
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int RandomNumbersQuantity = sc.nextInt();
		int NewLineRandomNumbersQuantity = sc.nextInt();
		Random rand = new Random();
		int random[] = new int[RandomNumbersQuantity];
		int NewLineRandom[] = new int[NewLineRandomNumbersQuantity];
		for (int i = 0; i < RandomNumbersQuantity; i++) {
			random[i] = rand.nextInt();
			System.out.print(random[i] + " ");
		}
		System.out.println('\n');
		for (int j = 0; j < NewLineRandomNumbersQuantity; j++) {
			NewLineRandom[j] = rand.nextInt();
			System.out.println(NewLineRandom[j]);
		}
	}
}
