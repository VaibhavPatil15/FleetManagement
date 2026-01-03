package JavaBasicProgram;

public class primenumber {

	public static void main(String[] args) {

		int number = 0;
		boolean flag = true;
		int[] arr = { 1, 2, 3, 1, 2, 3, 5, 6, 7, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			number = arr[i];
			if (number <= 2) {
				if (number == 0 || number == 1) {
					System.out.println(number + " : Not prime");
				} else {
					System.out.println(number + " : Prime");
				}
			} else {
				isPrime(number, flag);
			}
		}

	}

	public static void isPrime(int number, boolean flag) {
		for (int j = 2; j <= number / 2; j++) {
			if (number % j == 0) {
				System.out.println(number + " : Not prime");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(number + " :  Prime");
		}

	}
}
