package ExceptionsDemo;

public class ThrowsDemo1 {
	public void div(int a, int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c = a/b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          ThrowsDemo1 t = new ThrowsDemo1();
          try
          {
        	  t.div(10, 0);
          }
          catch(Exception e) 
          {
        	  e.printStackTrace();
        	  System.out.println("Do not give b as 0");
          }
          
          System.out.println("Execute the code1");
	}

}
