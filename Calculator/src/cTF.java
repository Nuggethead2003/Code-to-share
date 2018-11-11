import java.util.Scanner;

public class cTF {

	public static void celciusToFahrenheit() throws InterruptedException {
		do {
		try {
			System.out.println("Please enter a Celcius Number");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			double fNum = Double.parseDouble(input.next());
			double awnser = (fNum * 9 / 5) + 32;
			System.out.println(fNum + "Celcius is " + awnser + " in Fahrenheit");
			Thread.sleep(6000);
			Calc.repeat = false;
		} catch (Exception e) {

			System.out.println("Invalid Awnser");
			
		}

		
		
		} while (Calc.repeat);
		Calc.menuMain();
	}

}
