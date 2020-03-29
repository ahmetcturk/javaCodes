package week71;

public class MomShopping {
	
	int kidsShoeSize;
	int childNumber;
	
void buyShoes (){
	System.out.println("Moms buys shoes for their kids");
}
}
class Mom1 extends MomShopping{
	
	void buyShoes(){
		
		System.out.println("Mom1 buys shoe in sixe of : " + kidsShoeSize );
		super.buyShoes();
	}
}
class Mom2 extends MomShopping{
	
	void buyShoes(){
		System.out.println("Mom2 buys shoe in sixe of : " + kidsShoeSize);
	}
}
class Mom3 extends MomShopping{
	
	void buyShoes(){
		System.out.println("Mom3 buys shoe in sixe of : " + kidsShoeSize);
	}
}