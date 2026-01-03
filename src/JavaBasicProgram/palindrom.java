package JavaBasicProgram;

public class palindrom {

	public static void main(String[] args) {
		int a = 122;   // 200+ 20 + 1 = 221  1+22*10=221 2*10+2 0*10+2                      2+10*0  2*10+1=21   22*10+1=221   21=2*10+1
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
//		String str = "lsl";
//		String temp="";
//		for (int i = str.length()-1; i>=0; i--) {
//			temp=temp+str.charAt(i);
//		}
//		if(str.equals(temp)) {
//			System.out.println("is palindrome");
//		}
	}


//200
// 20
//  1 + 220 = 221
//  1 + 22 * 10 = 221
//  2 + 2 * 10  = 22
//  2 + 0 * 10  = 2
