package Lab9;

interface B4
{
        	int methodB(int i);
}
class A4 implements B4
{          
        	public int methodB(int i)
        	{
                    	return i = i * i;
                    	// i += 6
        	}
}

public class Question9 {
	public static void main(String[] args)
	{
            	B4 b = new A4();
            	System.out.println(b.methodB(2));
	}

}
