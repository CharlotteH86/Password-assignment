package password;

import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String rightPassword = "miyagi123";

		System.out.println("Greeting! Write the right password below to log in: ");

		String passwordInput;

		while (true) {
			passwordInput = reader.nextLine();
			if (passwordInput.equals(rightPassword)) {
				System.out.println("Right Password!");
				break;

			} else if (rightPassword != passwordInput) {
				System.out.println("Wrong password, try again: ");
			}

		}

	}

}
