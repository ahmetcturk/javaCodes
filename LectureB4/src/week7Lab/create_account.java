package week7Lab;

public class create_account extends Account {

	public create_account(String name, String accountType, int accountNumber, int accountBalance) {
		super(name, accountType, accountNumber, accountBalance);
		
	}

	public void insert(String n,int acc_num,String a_t){ // input user name, account number and type 
        name=n;
        accountType=a_t;
        accountNumber=acc_num; // generate random number 
        accountBalance=0;
    }

	public void display_details(){
		System.out.println("Name : " + name + "\nAccount Type : " + accountType + 
				"\nAccount Number : " + accountNumber + "\nAccount Balance : " + accountBalance);
	}
	public void deposit(int a){
		accountBalance += a;
	}
	public void withdraw(int a){
		accountBalance -= a;
	}
	int random(){
    	// These constant numbers (9000,1000 can be changed)
    	int randomNumber = (int)((Math.random() * 9000)+1000); 
    	return randomNumber;
}

}
