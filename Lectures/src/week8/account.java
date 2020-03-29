package week8;

public class account {

public static void main(String[] args) {
//Check if a given String has unique(duplicate) characters or not.

String text = "Nw Jrsyy";
String text1 = "Texas";


checkUnique(text);
checkUnique(text1);
System.out.println(checkUnique1(text1));
System.out.println(checkUnique1(text));
}
 public static void checkUnique(String str) {
 for (int i = 0; i < str.length(); i++) {
for (int j = i+1; j+1 < str.length(); j++) {
if (str.charAt(i)==str.charAt(j)) {
System.out.println("Duplicate Found : " + str.charAt(i));

}

}
}
 }

 //Texas
  public static boolean checkUnique1(String str) {
for (int i = 0; i < str.length(); i++) {
	for (int j = i + 1; j < str.length(); j++) {
		if (str.charAt(i) == str.charAt(j) &&( str.charAt(i) == '' ) {
			return true;
		}                
}
	
}
  
  return false;
} 
 
 
}