package _08_string_methods;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
String test = "saed";

		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt

		for(int i = 0; i<test.length(); i+=1) {

	System.out.println(test.charAt(i));
	if( 'a' == test.charAt(i)) {
		System.out.println("a is at index "+i);
	}
	else if( 's' == test.charAt(i)) {
		System.out.println("s is at index "+i);
	}
	else if( 'e' == test.charAt(i)) {
		System.out.println("e is at index "+i);
	}
	else {
		System.out.println("d is at index "+i);
	}
		
		}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


