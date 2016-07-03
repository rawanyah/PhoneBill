import java.util.Scanner;


public class PhoneBill{
	public static void main(String[] args){

		System.out.println("Inter your phone number:");
		Scanner scanner = new Scanner(System.in);

		int bill;
		try{
			bill = Integer.parseInt(scanner.nextLine());
		} 
		catch(NumberFormatException e) {
			System.out.println("input must be a number");
		}
	} 
}
