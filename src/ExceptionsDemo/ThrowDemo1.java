package ExceptionsDemo;

public class ThrowDemo1 {
	public void div(int a, int b) 
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
		ThrowDemo1 t = new ThrowDemo1();
		t.div(30, 0);

	}

}
