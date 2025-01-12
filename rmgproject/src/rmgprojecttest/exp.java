package rmgprojecttest;

import java.util.Iterator;

public class exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vip = "Heelo Java";
		String vip2 = "mello";
//		System.out.println(vip.charAt(9));
//		System.out.println(vip.concat(vip2));
//		System.out.println(vip.indexOf("g"));
//		System.out.println(vip + "      hh : " + vip2);
//		System.out.println(vip.replace(vip, vip2));

		String[] sc = vip.split(" ");
		
		// To make a starting character of the string Upercase or lowercase.
		for (int i = 0; i < sc.length; i++) {
			// System.out.println(sc[i]);
			System.out.println(sc[i].substring(0, 1).toLowerCase() + sc[i].substring(1, sc[i].length()));
			//System.out.println(sc[i].substring(0, 1).toUpperCase());
		}
		
		// To reverse the string on its own place
		String str2 = "";
		for ( int i = 0; i < sc.length; i++) {
			for (int j = sc[i].length(); j >= 1; j--) {
				str2+=sc[i].substring(j-1, j);
				
			}
			System.out.print(str2 + " ");
			str2="";
		}

	}

}
