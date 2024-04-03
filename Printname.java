package Java20;
import java.util.Scanner;
public class Printname {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter your Name:");
		String yourName =scanner.nextLine();
		
		for(int  i = 0; i < 500;i++){
			System.out.println(yourName);
		
			
		}
	}


}
