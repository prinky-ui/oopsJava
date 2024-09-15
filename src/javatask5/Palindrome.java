package javatask5;

public class Palindrome {

	public static void main(String[] args) {
		String input = "madam";

		if (isPalindorme(input)) {
			System.out.println(input + " is a Palindrome");
		} else {

		}
		System.out.println(input + " is not a Palindrome");
	}

	public static boolean isPalindorme(String input) {
		int length = input.length();
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
