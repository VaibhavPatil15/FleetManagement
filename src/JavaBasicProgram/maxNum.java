package JavaBasicProgram;

import java.util.Arrays;

public class maxNum {

	public static void main(String[] args) {
//		Integer[] arr = { 5, 8, 3, 4, 5 };
//		int max, min;
//		if (arr[0] > arr[1]) {
//			max = arr[0];
//			min = arr[1];
//		} else {
//			max = arr[1];
//			min = arr[0];
//		}
//		for (int i = 2; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > max) {
//					max = arr[i];
//				}
//				if (arr[j] < min) {
//					min = arr[j];
//
//				}
//			}
//		}
//		System.out.println(max + " " + min);
//	}
		int[] arr = { 598,46,89,25,48796,55,5, 8, 3, 4, 5 };
		int first = arr[0];
		int second = arr[0];
		int[] ard=sorted(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(ard[i]);
		}
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i]>first) {
//				second=first;
//				first = arr[i];
//			} else if (arr[i] > second && arr[i]<first) {
//				second = arr[i];
//			}
//		}
//		System.out.println(first + " " + second);
	}
	
	public static int[] sorted(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = 0; j < arr.length - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                // Swap arr[j] and arr[j + 1]
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	    return arr;
	}

}
