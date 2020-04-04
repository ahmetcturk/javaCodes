package week9;


class Main {
    public static void main(String[] args) {
       /*
        * Write a program that computes the following sum:
		sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N
		N is an integer limit that the user enters.
		Enter N
		4
		Sum is: 2.08333333333
        */
    		
    		double nominator = 1; // pay
    		int denominator = 1; // payda
    		double sum = 0;
    		
    		int limit = 4;
    		
    		for (int i = 0; i < limit; i++) {
				sum += (double)nominator/(double)denominator;
				denominator ++;
			}
    		System.out.println(sum);
    }
}