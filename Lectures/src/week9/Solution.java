package week9;//Write your code here

import java.util.Arrays;
import java.util.Scanner;

//Write your code here
interface AdvancedArithmetic{

}
class MyCalculator implements AdvancedArithmetic {
}
class Solution{
public static void main(String []args){
MyCalculator my_calculator = new MyCalculator();
System.out.print("I implemented: ");
ImplementedInterfaceNames(my_calculator);
System.out.println(my_calculator.getClass());
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

sc.close();
}
/*
* ImplementedInterfaceNames method takes an object and
prints the name of the interfaces it implemented
*/
static void ImplementedInterfaceNames(Object o){
Class[] theInterfaces = o.getClass().getInterfaces();
for (int i = 0; i < theInterfaces.length; i++){
String interfaceName = theInterfaces[i].getName();
System.out.println(interfaceName);
}
}
}