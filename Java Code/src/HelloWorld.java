
public class HelloWorld {
	
	static String randomString = "String to print";
	static final double PINUM = 3.141529;

	public static void main(String[]args) {
		
		System.out.println("Hello World");
		System.out.println(randomString);
		System.out.println(PINUM);
		
		int integerOne = 22;
		int integerTwo = integerOne + 1;
		System.out.println("integerOne = "+integerOne+" integerTwo = "+integerTwo);
		
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.14823794872734872347923748;
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		char randomChar= 66;
		char anotherChar = 'A';
		char escapedChars = '\\';
		System.out.println(randomChar);
		
		String randomString = "I'm a random string";
		String anotherString = "Stuff";
		String andAnotherString = randomString + ' ' + anotherString;
		System.out.println(andAnotherString);
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigLong);
		String floatString = Float.toString(bigFloat);
		String doubleString = Double.toString(bigDouble);
		String booleanString = Boolean.toString(trueOrFalse);
		
		double aDoubleValue = 3000000000000000000000.14546466464;
		int doubleToInt = (int)aDoubleValue;
		System.out.println(doubleToInt);
		
		int stringToInt = Integer.parseInt(intString);
		
		System.out.println(stringToInt);
	}
	
}
