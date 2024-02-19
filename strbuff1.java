// Java program to illustrate the 
// java.lang.StringBuffer append(char[] cstr, int iset, int length) 
import java.lang.*; 

public class Geeks { 

	public static void main(String[] args) 
	{ 

		StringBuffer sb = new StringBuffer("Geeks"); 
		System.out.println(" String buffer before = " + sb); 

		char[] cstr = new char[] { 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's', 
								'b', 'e', 'a', 'g', 'e', 'e', 'k' }; 

		/* appends the string representation of char array argument to this 
	string buffer with offset initially at index 0 and length as 8 */
		sb.append(cstr, 0, 8); 

		// Print the string buffer after appending 
		System.out.println("After appending string buffer = " + sb); 
	} 
} 

