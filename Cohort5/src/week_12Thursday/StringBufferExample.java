package week_12Thursday;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer stf = new StringBuffer("String");
		
		stf.append(" Buffer");
		
		System.out.println(stf);
		
		// Reverse Method
		stf.reverse();
		
		System.out.println(stf);
		
		// insert()
		stf.insert(0, " Concept");
		System.out.println(stf);
		
		//delete()
		
		stf.delete(0, 3);
		
		System.out.println(stf);
		
		// deleteChartAt()
		
		stf.deleteCharAt(3);
		

	}

}
