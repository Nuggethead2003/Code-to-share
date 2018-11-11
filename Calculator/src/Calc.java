import java.util.Scanner;

public class Calc {
	
	public static Scanner input = new Scanner(System.in);
	public static boolean lengthTest = false;
	private static int birthYear, length;
	public static boolean repeat = true;
	private static String choice;

	public static void main(String[] args) throws InterruptedException {
		repeat = true;
		do {
			try {
				System.out.println("Enter your birthday (Eg. 28 or 5)");
				birthYear = Integer.parseInt(input.next());
				length = String.valueOf(birthYear).length();
				if (length > 2 || birthYear == 0 || birthYear > 31) {
					lengthTest = false;
					System.out.println("Invalid Choice");
				} else {
					lengthTest = true;

				}

			} catch (Exception e) {

				System.out.println("Invalid Choice");
			}

		} while (!lengthTest);
		menuMain();
	}

	public static void menuMain() throws InterruptedException {
		// choice = Integer.toString(input.nextInt()).charAt(0);

		do {
			try {
				System.out.println("Please enter a number between 1-4 \n" + "1 = AreaOfTriangle \n"
						+ "----------------------------------\n" + "2 = HoursToDaysAndHours Calculator \n"
						+ "----------------------------------\n" + "3 = CelciusToFahrenheit Calculator \n"
						+ "----------------------------------\n" + "4 = BirthdayGame \n"
						+ "----------------------------------\n" + "e = Exit \n"
						+ "----------------------------------\n");
				choice = input.next().toLowerCase();
				switch (choice) {
				case "1":
					aOT.areaOfTriangle();
					break;
				case "2":
					hTDAH.hoursToDaysAndHours();
					break;
				case "3":
					cTF.celciusToFahrenheit();
				case "4":
					bG.birthdayGame();
					break;
				case "e":
					repeat = false;
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Choice");

			}
		} while (repeat);

	}

}
