//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle
{
	private double radius;
	private double area;
	

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea()
	{
		area = radius * radius * Math.PI;
	}

	public void print()
	{
		System.out.print("the area is :: ");
		System.out.printf("%.4f\n",area);	
	}
}