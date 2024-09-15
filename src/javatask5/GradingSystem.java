package javatask5;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Anna University Grading System");
		System.out.println("Enetre you marks : ");
		
		int mark = sc.nextInt();
		
		
		if(mark==100) {
			System.out.println("Grade S");//grade = 'S';
		}else if( mark>100) {
			System.out.println("Invaild input");
			
		}else if(mark>=90 && mark<99) {
			System.out.println("Grade A");//grade = 'A';
			
		}else if(mark>=80 && mark<89) {
			System.out.println("Grade B");// grade = 'B';
			
		}else if (mark>=70 && mark<79) {
			System.out.println("Grade C");//grade = 'C';
			
		}else if (mark>=60 && mark<69) {
			System.out.println("Grade D");//grade = 'D';
			
		}else if(mark>=50 && mark<59) {
			System.out.println("Grade E");//grade = 'E';
			
		}else if (mark<=49)
			System.out.println("Grade F");//grade = 'F'
	
	  
	    
	    		

		}	
		

	}
