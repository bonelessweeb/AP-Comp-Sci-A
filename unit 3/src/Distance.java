//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	public int xPair;
	public int yPair;
	public Distance()
	{
		


	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
		calcDistance();


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;

	}

	public void calcDistance()
	{
		xPair = xTwo - xOne;
		yPair = yTwo - yOne;
		distance = Math.sqrt(xPair * xPair + yPair * yPair);


	}

	public void print( )
	{
		System.out.print("distance == ");
		System.out.printf("%.3f",distance);


	}
}