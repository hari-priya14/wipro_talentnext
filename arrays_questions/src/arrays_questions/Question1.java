package arrays_questions;

public class Question1 {
	public static void main(String[] args) {
		int[] num= {12,24,36,48,60};
		int sum=0;
		double average;
		for(int i=0;i<num.length;i++) {
			sum +=num[i];
		}
		average=(double)sum/num.length;
		System.out.println("Sum of numbers is: " + sum);
		System.out.println("Average of numbers is" + average);
		
	}

}
