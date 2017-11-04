/*This program demonstrates conversion of integer to String
 * We will make use of String.valueof()
 * valueof() is static method of String class
 * Demonstration of program is given below*/


public class StringClass {      //class named as String class

	public static void main(String[] args) { //main method
		
		int i = 25;      //declaring int variables value as 25
		String st = String.valueOf(i); //conversion of int to String using String.valueof() method of String class
		System.out.println("This is conversion of int to String -> "+st+" (string)");   //displaying converted integer value as string
		
		System.out.println("Integer addition : "+(i+25));   //showing normal addition using + operator along with operand i declared as 25
		
		System.out.println("String concatenation : "+(st+25));   //here addition means string concatenation this result proves that int is converted to String

	}//end of main

}//end of class

//here we are proving conversion is done by showing concatenation of string, the output in second case is 2525 and not 50 because int is converted to string using String.valueof() method