package JavaBasicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class primenumber {

	public static void main(String[] args) {

//		int num = 14;
//		for (int i = 2; i <num-1; i++) {
//			boolean h = num % i == 0;
//			if (h) {
//				System.out.println(num + " : isnt the prime number");
//				break;
//			}else
//			System.out.println(num + " : is the prime number");
//		}

		int[] arr = { 1, 2, 3, 1, 2, 3, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] % 2 == 0) && !(arr[i] == 0) && !(arr[i] == 1)) {
				System.out.println(arr[i] + " Is the prime number");
			} else
				System.out.println(arr[i] + " is not prime");
		}

		

//		for (int ob : ar.get(i)) {
//			System.out.print(ob + " : ");
//			if (!(ob % 2 == 0)) {
//				System.out.println(ob + " Is the prime number");
//			} else
//				System.out.println(ob + " is not prime");
//		}
	}

}
