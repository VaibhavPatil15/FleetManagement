package JavaBasicProgram;

public class strManipulation {

	public static void main(String[] args) {
		int[] arr = { 2, 8, 6, 5, 5, 7, 1 };

		int small = arr[0];
		int num = 0;
		while (num < arr.length) {
			int temp = 0;
			for (int i = num+1; i < arr.length; i++) {
				if (arr[num] > arr[i]) {
					temp = arr[num]; 
//					arr[num]=arr[num]+arr[i]; //1+8
//					arr[i]=arr[num]-arr[i];
//					arr[num] = arr[num]-arr[i];
					arr[num]=arr[i];
					arr[i] = temp;
				}
			}
			num++;
		}
		for(int no:arr) {
			System.out.println(no);
		}
	}
}
