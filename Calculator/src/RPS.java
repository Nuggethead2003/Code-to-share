import java.util.Scanner;

public class RPS {
	public static boolean exit = false, show = false;
	public static int counter = 0;
	public static char computer = 0;
	public static String awnser;
	public static Scanner input = new Scanner(System.in);

	public RPS() {
		do {
			computer = 0;
			System.out
					.println("Welcome to RPS! \n" + "Please select one of the following choices:\n" + "R-----P-----S");
			do {
			awnser = input.nextLine();
			if (awnser == "show")
				show = true;
			if(computer == 0)
			switch ((int) (Math.random() + 1) * 3) {
			case 1: // R
				computer = 'r';
				break;
			case 2: // P
				computer = 'p';
				break;
			case 3: // S
				computer = 's';
				break;
			case 0:
				computer = 0;
				break;
				
			}
			
				System.out.println(computer);
			}while(!show);


			if (computer == 'r' && awnser == "p") {
				System.out.println("YOU WIN.");
			} else if (computer == 'r' && awnser == "r") {
				System.out.println("YOU TIE.");
			} else if (computer == 'r' && awnser == "s") {
				System.out.println("YOU WIN.");
			}
		} while (!exit);
	}
}
