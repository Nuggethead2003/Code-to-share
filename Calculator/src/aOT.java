import java.util.Scanner;

public class aOT {

	public static void areaOfTriangle() throws InterruptedException {
		do {	
		try {
				@SuppressWarnings("resource")
				Scanner input = new Scanner (System.in);
				System.out.println("Enter the base of the triangle");
				double fNum = Double.parseDouble(input.nextLine());
				System.out.println("Enter the hight of the triangle");
				double sNum = Double.parseDouble(input.nextLine());
				double awnser = (fNum * sNum) / 2;
				System.out.println("The area of your triangle is " + awnser + " units squared");
				Thread.sleep(5000);
				Calc.repeat = false;
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Invalid Awnser");
			}
		}while (Calc.repeat);
		Calc.menuMain();
	}
}
	
	


