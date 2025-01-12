package rmgprojecttest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practicsDay2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// String name="vaibhav";

		// System.out.println(name + "is staying at this place");

		// double a=12;
		// int b=22;
		// int c=5;7
		// double e=10;

		// System.out.println(c/e);
		// if both int & C < E then 0 c=5 , e=10
		// if both double or any of double & C < E then 0.5 c=5 , e=10

		// System.out.println(a%b);
		// if both double or any of double & a < b then 12.0 a=12 b=22
		// if both int & a<b then 12 a=12 b=22
//		int val = 6;
//		if ((val % 12 > 3) || (val / 12 > 3) && (val % 2 == 0) && (val % 4 == 0)) {
//			System.out.println(true);
//val.subS
//		} else
//			System.out.println(6 % 4 == 0);

		// String name = "vaibhav here";
		// substrin vaibhav here
		// System.out.println(name.substring(0, 1).toUpperCase()+name.substring(1,8)+
		// name.substring(8,9).toUpperCase()+name.substring(9,12));

		// String name2 = "ankur asija delhi test";
		// System.out.println(name2.substring(0, 1).toUpperCase()+name2.substring(1,
		// 6)+name2.substring(6, 7).toUpperCase()
		// +name2.substring(7, 12)+name2.substring(12,
		// 13).toUpperCase()+name2.substring(13, 18)+name2.substring(18,
		// 19).toUpperCase()+name2.substring(19, 22));

//		for (int i = 10; i <= 15; i++) {
//
//			System.out.println((i==14&&i<15?1:0));
//		}
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] >= 5 && arr[i] % 5 == 0) {
//				System.out.println(arr[i]);
//			}
//	
//		int val[]= {1,2,33,44,4,55,6,777,8,999,12};
//		int maximum = val[0];//1
//		int snd=val[1];
//		for (int i = 0; i < val.length; i++) {
//			if(val[i]>maximum)
//			{
//			
//				maximum=val[i];
//				
//			}
//		}
//		System.out.println(maximum);
//		System.out.println(snd);
//		int val[] = { 1,2,3,3,2,1 }; // 123 
//
//		Integer num = 0;   //  val[1]
//		int count = 0; // , val[J]
//		for (int i = 0; i < val.length; i++) {
//			// number = val[i];
//			if (val[i] == val[num]) {
//				count++;
//			}
//			if (i == val.length-1) {
//				System.out.println("Value " + val[num] + " : times "+count);
//				num += 1;
//				count=0;
//				i = -1;
//			}//else if(num==val.length-1) {
//				//break;
//				
//			}
//			
//		}

//		        int[] val = { 1, 2, 3, 1, 2, 3, 4, 5, 6, 1, 3, 7, 1 };
//
//		        //Create a map to store the count of each number
//		        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
//
//		        // Loop through the array and count occurrences of each number
//		        for ( int num1 : val) {
//		            countMap.put(num1, countMap.getOrDefault(num1, 0) + 1);
//		        }
//
//		        // Print out the counts
//		        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//		            System.out.println("Number " + entry.getKey() + " appears " + entry.getValue() + " times.");
//		        }
		// int a=2;
		// a=a;
		// System.out.println(a);

		int[] a = { 1, 2, 3, 4, 5, 6, 5, 6, 7 };
		// System.out.println(a.length);

		// Duplicates allowed follows inserton order & indexing
		List ls = new ArrayList<String>();
		ls.add(1);
		ls.add(null);
		ls.add("22");
		ls.add(1);
		ls.add(null);
		ls.add("22");
		ls.add(true);
		ls.add(true);
		ls.add(false);
		System.out.println(ls);

		ArrayList ls1 = new ArrayList();
		ls1.add("22");
		ls1.add(null);
		ls1.add("22");
		ls1.add("1");
		ls1.add("");
		ls1.add("22");
		// ls1.add(true);
		// ls1.add(true);
		// ls1.add(false);
		System.out.println(ls1);

		// Duplicates not allowed & doesnt follow insertion order & indexing i.e cant
		// use get(index) function
		Set st = new HashSet<Integer>();
		st.add(1);
		st.add(null);
		st.add("22");
		st.add(1);
		st.add(null);
		st.add("22");
		st.add(true);
		st.add(true);
		st.add(false);
		System.out.println(st);

		// Doesn't follow insertion order
		// Key : can be empty String,number,boolean and null as well (NOTE : Duplicate
		// key is updated with the new value)
		// value :
		Map mp = new HashMap<String, Integer>();
		mp.put("", "g");
		mp.put("", "gg");
		mp.put("a", null);
		mp.put(2, null);
		mp.put(null, null);
		mp.put(true, null);
		System.out.println(mp);

		List<Integer> ar = new ArrayList<Integer>();
		for (Integer it : a) {
			ar.add(it);
		}
		ar.add(null);
		ar.add(2);
		int i = 0;
		Set<Integer> st1 = new HashSet<Integer>(ar);
		for (Integer str : st1) {
			System.out.println(str + " : Element : " + i);
			i++;
		}
		System.out.println(st1);

		System.out.println("ArrayList[] : " + ar);
		System.out.println("Array :  " + a);
	}
}
