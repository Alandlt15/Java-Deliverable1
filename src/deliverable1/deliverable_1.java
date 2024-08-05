package deliverable1;
import java.util.Scanner;

public class deliverable_1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the restocking tool.");
		
		System.out.println("How many Sodas have been sold today? 100 are in stock.");
		int sodas = 100 - scnr.nextInt();
		if (sodas < 0) 
			System.out.println("That value is too high. Stock not adjusted");
		else {
			System.out.println("There are " + sodas + " Sodas left");
		}
		
		System.out.println("How many Chips have been sold today? 40 are in stock.");
		int chips = 40 - scnr.nextInt();
		if (chips < 0) 
			System.out.println("That value is too high. Stock not adjusted");
		else {
			System.out.println("There are " + chips + " Chips left");
		}
		
		System.out.println("How many Candy have been sold today? 60 are in stock.");
		int candy = 60 - scnr.nextInt();
		if (candy < 0) 
			System.out.println("That value is too high. Stock not adjusted");
		else {
			System.out.println("There are " + candy + " Candy left");
		}
		
		System.out.println("Thank you for filling out the values. Here's what needs to be restocked.");
		if (sodas < 40)
			System.out.println("Sodas need to be restocked");
		if (chips < 20)
			System.out.println("Chips need to be restocked");
		if (candy < 40)
			System.out.println("Candy needs to be restocked");
		
		scnr.close();
		
	}

}
