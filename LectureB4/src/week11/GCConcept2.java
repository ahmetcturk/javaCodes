package week11;

public class GCConcept2 {
	
	String field;

	public GCConcept2(String field) {
		this.field = field;
	}

	public static void main(String[] args) {
	
		GCConcept2 s1 = new GCConcept2("Silicone Labs");
		s1 = new GCConcept2("Selenium Part");
		s1 = null;
		//System.out.println(s1.field);
		
		new GCConcept2("Real Projects");
		
		System.gc();
		
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(this.field);
	}
	
	

}
