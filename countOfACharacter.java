package askedPgms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class countOfACharacter {

	public static void main(String[] args) {

		String str = "shine thekkekara amarakuni pulpally";
		long count=0;

		//1.Using for Loop method
		char[] charArray = str.toCharArray();
				
		for (char c : charArray) {
			if (c == 'a') {
				count++;
			}
		}
		System.out.println("The count of a in the string is = "+count);
		
		//2.Using Streams
		
		count=str.chars().filter(n->n=='a').count();		
		System.out.println(count);
		}
}
