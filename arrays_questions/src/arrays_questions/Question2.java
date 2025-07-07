package arrays_questions;
import java.util.Scanner;
public class Question2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers");
		int num=sc.nextInt();
		int[] arr =new int[num];
		System.out.println("Enter the numbers:");
		for(int i=0;i<num;i++) {
		  arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<num;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Maximum value:" + max);
		System.out.println("Minimum vlaue:" + min);
	}

}

