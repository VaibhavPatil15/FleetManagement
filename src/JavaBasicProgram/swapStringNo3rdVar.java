package JavaBasicProgram;

import java.util.Arrays;
import java.util.Iterator;

public class swapStringNo3rdVar {

	public static void main(String[] args) {
		String one = "vaibhav";
		String two = "patil";
		one = one + two; // HelloWorld
		two = one.substring(0, one.length() - two.length());
		one = one.substring(two.length()); // , one.length()
		System.out.println(one + " " + two);
		String[] arr=one.split("");

		 
	}

}
