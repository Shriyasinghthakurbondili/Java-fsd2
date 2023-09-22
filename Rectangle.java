package JavaProject;

public class Rectangle extends Shape{

	private int length;
	private int width;
	
	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	public void display()
	{
		System.out.println("Area of the Rectangle: " + calculateArea());
	}
	public double calculateArea()
	{
		return length * width;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle(10, 20);
		double area = obj.calculateArea();
		System.out.println("The area of the rectangle is: " + area);
		}
}
