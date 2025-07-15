package oops_questions;

public class Question6 {

	public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        // Example input
        String result = comboString("hi", "hello");
        System.out.println("Output: " + result);
		

	}
}


