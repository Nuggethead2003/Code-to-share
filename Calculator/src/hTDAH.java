import java.util.Scanner;

public class hTDAH {
	private static double awnser, sNum;
	private static Scanner input = new Scanner(System.in);
	
	public static void hoursToDaysAndHours() throws InterruptedException {

		do {
			try {
				System.out.println("Please enter number of hours");
				@SuppressWarnings("resource")
				
				double fNum = Double.parseDouble(input.nextLine());
				awnser = fNum % 24;
				sNum = fNum / 24;
				System.out.print((int) fNum + " hours = " + (int) sNum + " days and " + (int) awnser + " hours");
				Thread.sleep(5000);
				Calc.repeat = false;

			} catch (Exception e) {

				System.out.println("Invalid awnser!!!");
			}
		} while (Calc.repeat);
		Calc.menuMain();

	}

}
