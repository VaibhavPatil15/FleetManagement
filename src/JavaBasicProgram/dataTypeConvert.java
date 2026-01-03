package JavaBasicProgram;

public class dataTypeConvert {
	public static void main(String[] args) {
		String v = " vaibhav patil ";
		String newv = v.concat("200"); // or --> v + "200"
		System.out.println(newv);

		System.out.println(v.charAt(2));           // Gives character at index 0 __ Exception : index out of Bound if specified
											       // out of range
		System.out.println(v.indexOf("aadg"));     // Gives index of character __ Exception : -1 if not found
		System.out.println(v.trim());              // Removes white spaces from both ends);
		System.out.println(v.replace("Va", "dd")); // Replaces first string with second string"));
		//System.out.println(v.split(""));      
		System.out.println(v.substring(2, 5));     // Gives string from specified index to end of string __ Exception : index out of Bound if specified out of range
		String[] arr = v.trim().split(" ");        // Splits string into array of strings based on specified string
		for (String s : arr) {
			System.out.println("'" + s + "'");

		}
		System.out.println(arr.length);                    // length of an array (its not a length function)
		//System.out.println(arr.toString());
		//v.parseInt(v); // Converts string to integer
		String get = String.valueOf(42);                   // Converts integer to string Internally calls toString method
		System.out.println(Integer.toString(42));                              // Converts integer to string
		Integer.parseInt(get);                             // Converts string to integer
		
		System.out.println(get.length());                  // gives length of converted int to string  ( length function for a string )
		String[] newer = v.trim().split(" "); 
		String updated="";// Removes white spaces from both ends and replaces white spaces with empty string
		for (String ssr : newer) {
			updated+=ssr.substring(0, 1).toUpperCase()+ssr.substring(1,ssr.length()); // Capitalizes first letter of
			System.out.println("'" + ssr + "'");

		}
	}
}
