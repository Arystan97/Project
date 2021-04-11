import java.util.*;
class Main
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int l = arr.length;
		for(int i = 0; i < l; i++){
			arr[i] = sc.nextInt();
		}
		for(int j = l - 1; j > -1; j--){
			System.out.print(arr[j] + " ");
		}
	}
}
