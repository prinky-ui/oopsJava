package javatask5;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter Third Number: ");
		int c = sc.nextInt();
		
		if (a>b && a>c)

			System.out.println(a+ "is a Largest Number");
			
		else if (b>c && b>a) {
			System.out.println(b+ "is a Largest Nmuber");
			
		}else {
			
			System.out.println(c+ "is a Largest Number");
		

			}
		}
		}
	
		
	



