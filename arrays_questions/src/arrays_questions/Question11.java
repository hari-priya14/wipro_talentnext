package arrays_questions;

public class Question11 {

	public static void main(String[] args) {
		
		int[] arr= {1,4,11,4};
		boolean only14=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1 && arr[i]!=4) {
				only14=false;
				break;
			}
		}
		System.out.println(only14);

	}

}
