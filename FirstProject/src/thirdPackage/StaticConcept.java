package thirdPackage;

import java.awt.Checkbox;

// Static fields has only one memory. Hence all the objects will share the same values
// But non-static fields can have as many memory as the number of the object. Hence objects can have different values.

public class StaticConcept {
		
		static int count = 0;
		int i = 0;
		
		public void change_Count_I(){
			i += 5;
			count += 5;
		}
		
		static void increase(){
			count++;
			//i++;// Non-static fields can not be used in static methods
		}
		public static void main(String[] args) {
		
			StaticConcept check1 = new StaticConcept();
			StaticConcept check2 = new StaticConcept();
			
			// count will be same for all the objects
			check1.change_Count_I(); // check1.i = 5, count = 5
			check2.change_Count_I(); // check2.i = 5, count = 10
			
			System.out.println("Check 1 i : " + check1.i); // check1.i = 5
			System.out.println("Check 1 count : " + check1.count); // check1.i = 5
			System.out.println("Check 2 i : " + check2.i); // check1.i = 5
			System.out.println("Check 2 count : " + check2.count); // check1.i = 5
			
		}

}
