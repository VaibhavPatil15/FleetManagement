package JavaBasicProgram;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number of terms: ");
//		int n = sc.nextInt();
		int n = 14;
		int a = 0, b = 1, newnum = 0;
		int count = 0;
		// System.out.print("Fibonacci Series: " + a);
		for (int i = 0; i < n; i++) {
			if (newnum < n) {
				newnum = a + b;
				System.out.print(b + " : ");
				a = b;
				b = newnum;
				// count++;
			}

		}
	}

}
