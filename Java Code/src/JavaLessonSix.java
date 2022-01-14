import java.util.*;
import java.io.*;
public class JavaLessonSix {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[]args) {
		try {
		getAFile("./somestuff.txt");
		}catch(IOException e) {
			System.out.println("An IO Error occured");
		}
		/*
		 * System.out.println("How old are you? "); int age = checkValidAge();
		 * if(age!=0) { System.out.println("You are "+age+" years old"); }
		 */
		
		
	}
	
	/*public static void getAFile(String fileName) {
		
		try {
			FileInputStream file = new FileInputStream(fileName);
		}catch(FileNotFoundException e) {
			System.out.println("Sorry can't find that file");
		}catch(IOException e) {
			System.out.println("Unknown IO Error");
		}
		catch(ClassNotFoundException|IOException e) {}
		catch(Exception e) {
			System.out.println("Some error occured");
		}finally {
			System.out.println("");
		}*/
	
	public static void getAFile(String fileName) throws IOException, FileNotFoundException{
		FileInputStream file = new FileInputStream(fileName);
	}
		
		/*
		 * try { return userInput.nextInt(); }catch(InputMismatchException e) {
		 * userInput.next(); System.out.print("That is not a whole number"); return 0; }
		 */
	}
	/*
	 * public static void divideByZero(int a) { try { System.out.println(a/0);
	 * }catch(ArithmeticException e) { System.out.println("You can't do that");
	 * System.out.println(e.getMessage()); System.out.println(e.toString());
	 * e.printStackTrace(); } }
	 */


