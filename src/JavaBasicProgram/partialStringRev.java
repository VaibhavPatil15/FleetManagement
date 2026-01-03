package JavaBasicProgram;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class partialStringRev {
 public static void main(String[] args) {
     String name="vaibhav is my name";
     String arr[]=name.split(" ");
     int i=0;
     String temp="",temp2="";
     Character.isUpperCase(0);
     
     while(i<arr.length){
         
         if(i==2){
          for(int j=arr[i].length()-1;j>=0;j--) {
              temp2=temp2+arr[i].charAt(j);
          }  
          temp=temp+temp2+" ";
         }else{
             temp=temp+arr[i]+" ";
         }
         i++;
     }
     System.out.print(temp.trim());
     System.out.println();
//     Character.isUpperCase(name.charAt(i));
//     Character.isLowerCase(0);
//     Character.is
 }
}
