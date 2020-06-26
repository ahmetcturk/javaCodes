package week8Recap;

public class SiliconeAccount {

	private String email;
	private String userName;
	private String passWord;
	
	// First way, Create constructor
	public SiliconeAccount(String email, String userName, String passWord) {
		super();
		this.email = email;
		this.userName = userName;
		this.passWord = passWord;
	}
	// Second way, Create a method
	public void setAccountInfo(String email, String username, String password){
		this.email = email;
		this.userName = username;
		this.passWord = password;
		
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassWord(String passWord) {
		if(passWord.length() < 6){
			System.out.println("Password must be at least 6 characters");
		}
		else{
			this.passWord = passWord;
		}
	}
	
	
	
	
	public String getEmail() {
		return email;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	
	
	
}
