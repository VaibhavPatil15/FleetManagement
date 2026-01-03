package JavaBasicProgram;

import java.util.Arrays;

public class AnagramChecker {
	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false; // Anagrams must have the same length
		}
		 my name is vaibhav

		
		// Convert strings to character arrays and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		//Integer [] an=new Integer[20];

		// Compare the sorted arrays
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "Silent";)
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if (isAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}
}