package ExceptionsDemo;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 9/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) 
		{
		
		     System.out.println(e);
			
		      System.out.println("you cannot divide by zero");
		      e.printStackTrace();
		      System.out.println(e.toString());
		}
		finally {
			System.out.println("I am in finally Block");
		}
	}

}
