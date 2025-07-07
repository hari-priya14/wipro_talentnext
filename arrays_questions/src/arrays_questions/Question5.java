
package arrays_questions;
import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		int[] arr={11,12,42,42,12,23,26,98};
		
		Arrays.sort(arr);
		int smallest1=arr[0];
		int smallest2=arr[1];
		int largest1=arr[arr.length-1];
		int largest2=arr[arr.length-2];
		System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest two numbers: " + largest1 + ", " + largest2);
		
		

	}

}
