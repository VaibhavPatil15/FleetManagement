package JavaBasicProgram;

import java.util.ArrayList;
import java.util.List;

public class armstrong {
	//static List ls = new ArrayList();
	static int count = 0;

	public static void main(String[] args) {
		
		int num=407; // 407
		//Integer init=num;

		int digits=Integer.toString(num).length();
		//System.out.println(digits);
		//int temp=0,nu=num,tempcount=0,allCount=0;
//		for (int i = 0; i < digits; i++) { 
//			temp=nu%10;
//			tempcount=temp;
//			for (int j = 1; j < digits; j++) {
//				tempcount=tempcount*temp;
//			}
//			allCount=tempcount+allCount;
//			nu=nu/10;
//		}
		int temp=num,digit=0,mul=1,add=0;
		
		while(temp>0) {
			digit=temp%10;
			for(int i=0;i<digits;i++) {
				mul=digit*mul;
			}
			add=mul+add;
			mul=1;
			temp=temp/10;
		}
		
		
		if(num==add) {
			System.out.println("is armstrong");
		}
	}

	

}