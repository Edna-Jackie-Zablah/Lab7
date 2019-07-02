package invalidInputs;
import java.util.*;


public class InvalidInputs {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		boolean validName = validateNames(scnr, "Please enter a valid name: ");
		boolean validEmail = validateEmails(scnr, "Please enter a valid email: ");
		boolean validpnone = validatePhone(scnr, "Please enter a valid phone number: ");
		boolean validDate = validateDate(scnr, "Please enter a date: ");


		




	}

	public static boolean validateNames(Scanner scnr, String prompt) {

		boolean isValid = false;
		String input;

		do {
			System.out.print(prompt);
			input = scnr.nextLine();

			if (input.matches("[A-Z][a-zA-Z]{1,30}")) {
				isValid = true;
				System.out.println("name is valid");
			} else {
				System.out.println("Sorry, name is not valid");
				isValid = false;
			}
		} 
		while (!isValid);

		return isValid;
	}



	public static boolean validateEmails(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;

		do {
			System.out.print(prompt);
			input = scnr.nextLine();

			if (input.matches("[a-zA-Z\\d]{5,30}[@][a-zA-Z0-9]{5,10}.com")) {
				isValid = true;
				System.out.println("email is valid");
			} else {
				System.out.println("Sorry, email is not valid");
				isValid = false;
			}
		} 
		while (!isValid);

		return isValid;
	}

	
	public static boolean validatePhone(Scanner scnr, String prompt) {
			boolean isValid = false;
			String input;

			do {
				System.out.print(prompt);
				input = scnr.nextLine();

				if (input.matches("\\d{3}-\\d{3}-\\d{4}")) {
					isValid = true;
					System.out.println("the phone number is valid");
				} else {
					System.out.println("Sorry, the phone number is not valid");
					System.out.println("use this format: xxx-xxx-xxxx");
					isValid = false;
				}
			} 
			while (!isValid);

			return isValid;
		}

	public static boolean validateDate(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;

		do {
			System.out.print(prompt);
			input = scnr.nextLine();

			if (input.matches("\\d{2}[/]\\d{2}[/]\\d{4}")) {
				isValid = true;
				System.out.println("the date is valid");
			} else {
				System.out.println("Sorry, the date is not valid");
				System.out.println("use this format: dd/mm/yyyy");
				isValid = false;
			}
		} 
		while (!isValid);

		return isValid;
	}

	}



