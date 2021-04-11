import java.util.*;

public class Main
{
	static void FindWordLengthAndSort(Integer array[]){
		int max = 0;
		int min = 1000;
		for (int i : array) {
			if (i > max) {
				max = i;
			}
			else if (i < min) {
				min = i;
			}
		}
		System.out.println("Max number: " + max + ", word length: " + Integer.toString(max).length());
		System.out.println("Min number: " + min + ", word length: " + Integer.toString(min).length());
		Arrays.sort(array);
		System.out.print("Sorted array: " + Arrays.toString(array) + '\n');
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Inverse sorted array: " + Arrays.toString(array));
	}
	static void FindGreaterOrLowerThanMiddleElements(Integer array[]){
		double sum = 0;
		double middle;
		for (int i : array){
			sum += Integer.toString(i).length();
		}
		middle = sum/array.length;
		for(int j : array){
			if(Integer.toString(j).length() > middle){
				System.out.println("Numbers with length higher than middle: " + j + ", length " + Integer.toString(j).length());
			}
			else if(Integer.toString(j).length() < middle){
				System.out.println("Numbers with length lower than middle: " + j + ", length " + Integer.toString(j).length());
			}
		}
		System.out.println("Middle number: " + middle);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length" + '\n');
		int l = sc.nextInt();
		System.out.println("Enter array elements");
		Integer array[]=new Integer[l];
		for(int i = 0; i < l; i++){
			array[i]=sc.nextInt();
		}
		FindWordLengthAndSort(array);
		FindGreaterOrLowerThanMiddleElements(array);
	}
}