import java.util.Scanner;

public class Calc {

	public static Scanner input = new Scanner(System.in);
	public static boolean lengthTest = false;
	private static int birthDay, length, check;
	public static boolean repeat = true, easterEgg = false;
	private static String choice;

	public static void main(String[] args) throws InterruptedException {
		RPS rps = new RPS();
		rps();
		repeat = true;
		do {
			try {
				System.out.println("Enter your birthday (Eg. 28 or 5)");
				birthDay = Integer.parseInt(input.next());
				length = String.valueOf(birthDay).length();
				if (length > 2 || birthDay <= 0 || birthDay > 31) {
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

					check = bG.birthdayGame();
					easterEgg = true;
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
			if (easterEgg) {
				if (birthDay == check) {
					int random = (int) (Math.random() * 2);
					if (random == 1) {
						System.out.println("I dont know why but some times i feel great when i take a poop");
						Thread.sleep(5000);
						easterEgg = false;
					} else if (random == 0) {
						System.out.println("Some ones really truthfull today ;)");
						Thread.sleep(5000);
						easterEgg = false;
					}
				}else if (birthDay != check) {

						System.out.println("BOI YOU BETTER START LEARNING NOT TO LIE!!!!");
						Thread.sleep(3000);
						System.out.println("FOR YOUR PUNISHMENT YOU WILL BE KICKED OUT OF THE PROGRAM");
						Thread.sleep(3000);
						System.out.println("GOOD BYE DEAR HUMAN!!!!");
						Thread.sleep(3000);
						repeat = false;
					}

				}
			
		
		} while (repeat);

	}

}
