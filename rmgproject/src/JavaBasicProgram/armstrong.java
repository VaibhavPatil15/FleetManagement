package JavaBasicProgram;

import java.util.ArrayList;
import java.util.List;

public class armstrong {
	static List ls = new ArrayList();
	static int count = 0;

	public static void main(String[] args) {
		int n = 2;
		int dig = 0;
		double cube = 0;
		int j = 0;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			int num = i;
			while (num > 0) {
				dig = num % 10;
				ls.add(dig);
				num = num / 10;
			}
			if (j < ls.size()) {
				sum = sum + power();
				j++;
			}
		}

	}

	public static int power() {
		int ary = ls.size();
		for (int i = 0; i < ary; i++) {
			int firstDigit = (int) ls.get(i);
			while (count < ary) {
				firstDigit = firstDigit * firstDigit;
				ls.set(i, firstDigit);
				count++;
			}
		}
		return 0;

	}

}