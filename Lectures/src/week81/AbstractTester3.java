package week81;


public class AbstractTester3{ 
	public static void main(String[] args) { 
		Car ford =new Ford(); 
		ford.setWeight(1000); 
		ford.setModel("Fiesta"); 
		ford.setColor("Gray"); 
		Car mercedes=new Mercedes(); 
		mercedes.setWeight(2000); 
		mercedes.setModel("E200"); 
		mercedes.setColor("Black"); 
		UserScreen screen =new UserScreen(); 
		screen.show(ford); 
		screen.show(mercedes); 
		
		} 
	} 