import.java util.Scanner;

public class MajorOutput01 {

	public static void main (String [] args) {

	Scanner keyboard = new Scanner(System.in);

	int useAge;
	double userDecimal;
	String userName;

	System.out.println("Please type in your age: ");
	usageAge = keyboard.nextInt();

	System.out.println("Please type in a decimal:");
	userAge = keyboard.nextDouble();

	System.out.println("Please type in your name:");
	userName = keyboard.nextLine();

	System.out.println("The user named" + userName +",aged"+userAge +"has a favorite decimal" + userDecimal);
	}
	
}