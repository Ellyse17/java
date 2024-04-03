package Java20;

import java.util.Scanner;

public class Simplecalculator {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter a first number:");
		double num1 = scanner.nextDouble();
		
		
		System.out.print("Enter a second number:");
		double num2 = scanner.nextDouble();
		
		
		System.out.println("sum:"+(num1+num2));
		System.out.println("Difference:"+(num1-num2));
		
	}

}
