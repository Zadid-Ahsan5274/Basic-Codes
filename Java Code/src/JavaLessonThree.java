
public class JavaLessonThree {

	public static void main(String[] args) {

         /* int randomNumber = (int)(Math.random()*50);
         if(randomNumber < 25) {
        	 System.out.println("The random number is less than 25");
         }else if(randomNumber > 40) {
        	 System.out.println("The random number is greater than 40");
         }else if(randomNumber <= 18) {
        	 System.out.println("The random number is equal to 18");
         }else if(randomNumber >= 40) {
        	 System.out.println("The random number is not equal to 40");
         }else {
        	 System.out.println("Nothing worked");
         }
         
         if(!(false)) {
        	 System.out.println("\nI turned false into true");
         }
         
         if((false)&&(true)) {
        	 System.out.println("Both are true");
         }
         
         if((true)&&(true)) {
        	 System.out.println("Both are true");
         }
         if((false)|(true)) {
        	 System.out.println("One is true");
         }
         System.out.println("The random number is "+randomNumber);*/
		
		/*int valueOne = 1;
		int valueTwo = 2;
	    int biggestValue = (valueOne > valueTwo)? valueOne : valueTwo;
		System.out.println(biggestValue);*/
		char theGrade = 'b';
		switch(theGrade) {
		case 'A':
			System.out.println("Great Job");
			break;
		case 'b':
		case 'B':
			System.out.println("Good Job");
			break;
		case 'C':
			System.out.println("Ok");
			break;
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("You Failed");
			break;
		}
	}

}
