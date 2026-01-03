package JavaBasicProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) throws Exception {
		
		

        System.out.println("Try programiz.pro");
        String str="vaibhav patil"; //character T index of it
        System.out.println(str.indexOf("T"));
       
        char cha;
        int count=1;
        //Set<String> lst=new HashSet<>();

        Map<Character,Integer> map=new HashMap();
        for(int i=0;i<str.length();i++) {
        	cha=str.charAt(i);
        	if(!(map.containsKey(cha))) {
        		map.put(cha, count);
//        		map.get(map);
//        		map.replace(cha, count);
        		//map.
        	}else {
        		count++;
        		map.replace(cha, count); // to remove a data from map map.remove(<key here>), for list remove(<index>) for list lst.set(index, <value>) [To replace]
        	}
        	count=1;
        }
      
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
        	
        	if(entry.getValue()>1) {
        		System.out.println(entry.getKey()+ "repeated times :"+entry.getValue());
        	}
        }
        
//        //Count and character
//        String [] arr=str.split("");
//        for(int i=0;i<arr.length;i++){
//            if(!(arr[i].equalsIgnoreCase("t"))){
//               
//                
//            }else if(arr[i].equalsIgnoreCase("t")){
//            	System.out.println(i+"is present");
//            }
//        }
    
		
		
//		String name = "vaibhav";
////		Map<Character, Integer> map = new HashMap<>();
////		int count = 1;
////		for (int i = 0; i < name.length(); i++) {
////			char cha = name.charAt(i);
////			if (!map.containsKey(cha)) {
////				map.put(cha, count);
////			} else {
////				count++;
////				map.replace(cha, count);
////			}
////			count = 1;
////
////		}
//
////		for (Map.Entry<Character, Integer> m : map.entrySet()) {
////			System.out.println(m.getKey() + ", Count : " + m.getValue());
////		}
////		int num =   658564356;
////	
////		Map<Character, Integer> map = new HashMap<>();
////		String str=Integer.toString(num);
////		int count=1;
////		for(int i=0;i<str.length();i++) {
////			Character cha=str.charAt(i);
////			if(!(map.containsKey(cha))) {
////				map.put(cha, count);
////			}else {
////				count=map.get(cha)+1;
////				map.replace(cha, count);
////			}
////			count=1;
////		}
////		for(Map.Entry<Character,Integer> m:map.entrySet()) {
////			System.out.println(m.getKey()+", Count : "+m.getValue());
////		}
////		Iterator<Map.Entry<Character, Integer>> entry= map.entrySet().iterator();
////		Map.Entry<Character,Integer> in=null;
////		while(entry.hasNext()) {
////			in=entry.next();
//			System.out.println(in.getKey()+", Count : "+in.getValue());
//			
//			Iterator<datatype of list or set> entry=.iterator();
//			while(entry.hasNext()) {
//				int nu=entry.next();
//			}
//		}
//        String str = "vaibhavvh";
//        int[] charCount = new int[256]; // Array to store ASCII character counts
//
//        int [] charcount=new int[256]; 
//        for(int i=0;i<str.length();i++) {
//        	char ch=str.charAt(i);
//        	charCount[ch]++;
//        }
//        for(int j=0;j<charCount.length;j++) {
//        	if(charCount[j]>0) {
//        		System.out.println((char)j+" : "+charCount[j]);
//        	}
//        }
//        
//        int num = 112345511;
//        int[] digitCount = new int[10]; // Array to store the frequency of digits (0-9)
//
//        // Count occurrences of each digit
//        while (num > 0) {
//            int digit = num % 10; // Extract the last digit
//            digitCount[digit]++;  // Increment the count for that digit
//            num /= 10;            // Remove the last digit
//        }
//
//        // Display the occurrences
//        System.out.println("Digit frequencies:");
//        for (int i = 0; i < digitCount.length; i++) {
//            if (digitCount[i] > 0) {
//                System.out.println("Digit " + i + ": " + digitCount[i]);
//            }
//        }

        // Count occurrences of each character
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            charCount[ch]++;
//        }
//
//        // Display the occurrences
//        System.out.println("Character frequencies:");
//        for (int i = 0; i < charCount.length; i++) {
//            if (charCount[i] > 0) {
//                System.out.println((char) i + ": " + charCount[i]);
//            }
//        }
        throw new Exception("sdvs");
	}

}
