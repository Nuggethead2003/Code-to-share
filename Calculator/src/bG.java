
public class bG {
	private static double userInput, birthMonth, birthDay;
	public static int birthdayGame() throws InterruptedException {
		boolean repeat = true;
		do {
			
			try {
				System.out.print("1.Determine your birth month (January=1, February=2, and so on).\n"
						+ "2.Multiply that number by 5.\n" + "3.Add 6 to that number.\n"
						+ "4.Multiply the number by 4.\n" + "5.Add 9 to the number.\n"
						+ "6.Multiply that number by 5.\n"
						+ "7.Add your birth day to the number (10 if born on the 10th and so on).\n"
						+ "8.Enter your number below.\n");
				//input
				userInput = Double.parseDouble(Calc.input.next());
				//processing
				birthMonth = (userInput-165)/100;
				birthDay = (userInput-165) % 100;
				//Output
				System.out.println("Your BirthMonth is "+
				(int)birthMonth +
				" and your Birthday is "+
				(int)birthDay);
				repeat = false;
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("Invalid Choice");
			}
		} while (repeat);
		return (int)birthDay;
		
	}
	
		
	}

