import java.util.Scanner;
public class JavaLessonFive {

	/*
	 * static double myPI = 3.14159; //class variable
	 */	
	static int randomNumber;
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		//System.out.println(addThem(1,2));
		//System.out.println("Global "+myPI);
		
		/*
		 * int d = 5; tryToChange(d); System.out.println("main d = "+d);
		 */
		
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while(guessResult != -1) {
			System.out.println("Guess a number between 0 and 50: ");
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("Yes the randome number is "+randomGuess);
		
	}
	public static int getRandomNum() {
		randomNumber = (int)(Math.random()*51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess) {
		if(guess == randomNumber) {
			return -1;
		}else {
			return guess;
		}
	}
	
	
	/*
	 * public static void tryToChange(int d) { d = d + 1;
	 * System.out.println("tryToChange d = "+d); }
	 */
	
	/*
	 * public static int addThem(int a, int b) { double smallPI = 3.140; local
	 * variable myPI = myPI + 3.0; System.out.println("Local "+myPI); int c = a + b;
	 * 
	 * return 1; }
	 */
}
