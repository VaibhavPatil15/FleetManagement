package rmgprojecttest;

public class trial {

	public static void main(String[] args) {
		String name = "vaibhav patil";
//System.out.println(name.substring(0, 7));
		// =name.split(" ");

//		for (int i = str1.length()-1; i >=0; i--) {  //for (int i = name.length()-1; i >=0; i--)
//			System.out.print(str1.charAt(i));
//			if(i==0) {
//				
//			}
//		}
		// HW
		/*
		 * String name1 = "vidhyadhar test";
		 * 
		 * String split[] = name1.split(" ");
		 * 
		 * for (int i = 0; i < split.length; i++) {
		 * 
		 * String value = split[i]; for(int j=value.length()-1;j>=0;j--) {
		 * System.out.print(name1.charAt(j)); }
		 * 
		 * }
		 */
		int ar[] = { 1, 0, 2, 11, 0 };
		int val = 0;
		for (int i = 1; i < ar.length; i++) {

			if (ar[val] < ar[i]) {

				ar[val] = ar[i];
				System.out.println(ar[val]);
				val += 1;
				i = val; // num=ar[i];

				// System.out.println(ar[i]);
				// i=val-1;
			}
			// System.out.println(ar[i]);

			// System.out.println();
		}
	}

	public void gamer() {
		System.out.println("fff");
	}

}
