package com.example.demo;

import java.util.*;

public class Palindromo {
	static int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//examples
		//alA  am addama
		//moraRomaa

		String strpal = "moraRomaa";
		if (canFormPalindrome(strpal.replace(" ", "").trim().toLowerCase()))
			System.out.println("Is a permutation of a palindrome");
		else
			System.out.println("Not is a permutation of a palindrome");

	}

	static boolean canFormPalindrome(String str) {

		// Create a count array and initialize all
		// values as 0
		int count[] = new int[NO_OF_CHARS];
		Arrays.fill(count, 0);

		// For each character in input strings,
		// increment count in the corresponding
		// count array
		for (int i = 0; i < str.length(); i++)
			count[(int) (str.charAt(i))]++;

		// Count odd occurring characters
		int odd = 0;
		for (int i = 0; i < NO_OF_CHARS; i++) {
			if ((count[i] & 1) == 1)
				odd++;

			if (odd > 1)
				return false;
		}

		// Return true if odd count is 0 or 1,
		return true;
	}

}
