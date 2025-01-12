package JavaBasicProgram;

public class palindrom {

	public static void main(String[] args) {
		int a = 1233456381;
		int temp = a;
		int sum = 0;
		while (temp > 0) {
			int last = temp % 10;
			sum = sum * 10 + last;
			temp = temp / 10;
		}
		if (sum == a) {
			System.out.println("is palindrome");
		} else {
			System.out.println("is not palindrome");
		}

	}

}
