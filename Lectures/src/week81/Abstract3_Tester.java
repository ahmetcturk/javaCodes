package week81;


public class Abstract3_Tester{ 
	public static void main(String[] args) { 
		Abstract3_Car ford =new Abstract3_Ford(); 
		ford.setWeight(1000); 
		ford.setModel("Fiesta"); 
		ford.setColor("Gray"); 
		Abstract3_Car mercedes=new Abstract3_Mercedes(); 
		mercedes.setWeight(2000); 
		mercedes.setModel("E200"); 
		mercedes.setColor("Black"); 
		Abstract3_UserScreen screen =new Abstract3_UserScreen(); 
		screen.show(ford); 
		screen.show(mercedes); 
		
		} 
	} 