package week7;

public class EducationalInstitution{
    private int years;
    int a;

    public EducationalInstitution(int years){
        this.years=years;
    }

    public EducationalInstitution() {
    	this(7);

    }

    public String graduationRequirements(){
        return years + " years of study";
    }
    public static void main(String[] args) {
    	EducationalInstitution obj = new EducationalInstitution();
    	

	}
}

    class LawSchool extends EducationalInstitution{
	  
    // Your code here
    

		
	public LawSchool() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LawSchool(int years) {
		super(years);
		// TODO Auto-generated constructor stub
	}
	
    
   
    @Override
    public String graduationRequirements() {
        return super.graduationRequirements()+" and passing the bar";
    }
}