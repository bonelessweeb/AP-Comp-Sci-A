//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
		calculateSlope();
		print();

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		calculateSlope();
	}

	public void calculateSlope( )
	{
		double y = yTwo - yOne;
		double x = xTwo - xOne;
		slope = y/x;

	}

	public void print( )
	{
		System.out.print("The slope is ");
		System.out.printf("%.2f\n", slope);


	}
}