package Lab7;

import java.util.Scanner;

class Account{
    String name,acc_type;
    int Acc_num,Acc_Balance;
	public Account(String name,int acc_num,int acc_Balance,String acc_type) {
		
		this.name = name;
		this.acc_type = acc_type;
		Acc_num = acc_num;
		Acc_Balance = acc_Balance;
	} 
    
} // end class

class create_account extends Account{
	


	public create_account(String name, int acc_num, int acc_Balance, String acc_type) {
		super(name, acc_num, acc_Balance, acc_type);
		// TODO Auto-generated constructor stub
	}

	void insert(String n,int acc_num,String a_t){ // input user name, account number and type 
        name=n;
        acc_type=a_t;
        Acc_num=acc_num; // generate random number 
        Acc_Balance=0;
    }
    
    
 
 void deposite(int amount){  
	 // inserting money
	 Acc_Balance += amount;
                 }
        
        void withdraw(int amount){
        	// withdraw money
       	 Acc_Balance -= amount;
                 }

       int random(){
        	// These constant numbers (9000,1000 can be changed)
        	int randomNumber = (int)((Math.random() * 9000)+1000); 
        	return randomNumber;
      
  }
       void display_details(){
       	// Display informations
       	System.out.println("Account holder name : " + name);
       	System.out.println("Account number : " + Acc_num);
       	System.out.println("Account type : " + acc_type);
       	System.out.println("Account balance : " + this.Acc_Balance);
       }
  
} // end class 
  
public class Main {
    public static void main(String args[]){
    	
    	boolean check = true;
    	do {
    		create_account object1 = new create_account("Ahmet", 42, 1000, "Saving");
    		Scanner scanner = new Scanner(System.in);
        	System.out.println("Press 1 if you want to deposit money");
        	System.out.println("Press 2 if you want to withdraw money");
        	System.out.println("Press 3 if you want to see all the informations");
        	System.out.println("Press 4 to quit");
        	
        	int userChoice = scanner.nextInt();
        	
        	switch (userChoice) {
    		case 1:
    			System.out.println("How much you want to deposit : " );
    			int deposit = scanner.nextInt();
    			object1.deposite(deposit);
    			System.out.println(object1.Acc_Balance);
    			break;
    			

    		case 2:
    			System.out.println("How much you want to withdraw : " );
    			int withdraw = scanner.nextInt();
    			object1.deposite(withdraw);
    			System.out.println(object1.Acc_Balance);
    			break;
    		
    		case 3:
    			object1.display_details();
    			break;
    		case 4:
    			check = false;
    			System.out.println("Thanks, bye");
    		
    	}
        	

		} while (check);
    	
             
     } //  end main function 
    
} //  end mian class



