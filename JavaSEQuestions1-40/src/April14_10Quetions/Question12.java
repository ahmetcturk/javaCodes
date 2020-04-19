package April14_10Quetions;

public class Question12 {

	public static void main(String[] args) {
		String ta = "A ";
		
		ta = ta.concat("B ");		
			System.out.println(ta);	//
		String tb = "C ";
		ta = ta.concat(tb);			 
			System.out.println(tb);	//
		ta.replace('C', 'D');		//*	
			System.out.println(ta);	//
		ta = ta.concat(tb);			 
		System.out.println(ta);		// 

	}

}
