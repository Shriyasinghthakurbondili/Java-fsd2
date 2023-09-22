package ExceptionsDemo;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i =9;
        int j = 0;
        
        try
        {
        	System.out.println("Results:" + i/1);
        }
        catch(ArithmeticException e)
        {
        	System.out.println(e.getMessage());
        	System.out.println("Please dont give a zero value");
        }
        System.out.println("Results for addition: " + i+j);
        System.out.println("Results for subtraction: " + (i-j));
        System.out.println("Results for multiplication: " + i*j);
	}

}
