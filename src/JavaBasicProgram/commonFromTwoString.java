package JavaBasicProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class commonFromTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "abcabcAbc";
		String str2 = "adcbabcabc";
		System.out.println(str1.contains("a"));
		//Set<Character> st=new HashSet(Arrays.asList(str1.toCharArray()));
////		for(Character cho:st) {
////			System.out.println(cho);
////		}
//		int num = 100;
//		String str = String.valueOf(num);
//		System.out.println(str); // "100"
//		int num2 = 200;
//		String str3 = Integer.toString(num2);
//		System.out.println(str3); // "200"


		int i=0;
		while(i<str1.length()) {
			for(int j=0;j<str2.length();j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					System.out.println("string1: " + str1.charAt(i) + "" + str2.charAt(j));
					break;
				}
				
			}
			i++;
		}

	}

}
