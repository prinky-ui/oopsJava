package javatask5;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		String reString = " ";
	for(int i = str.length()-1; i>=0; i-- ) {
			reString = reString + (str.charAt(i));
			
				}
		System.out.println("The reverse string is: "  + reString );
		
	}

}
