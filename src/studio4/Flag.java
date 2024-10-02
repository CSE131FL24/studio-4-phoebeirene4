package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setXscale(-10, 10);
		StdDraw.setYscale(-10, 10);
		
		StdDraw.setPenColor(255, 141, 161);
		StdDraw.filledRectangle(0, -4, 15, 4);
		
		StdDraw.setPenColor(255, 215, 161);
		StdDraw.filledRectangle(0, 4, 15, 4);
		
		StdDraw.setPenColor(128, 0, 128);
		StdDraw.filledRectangle(0, 0, 3, 3);
		
		StdDraw.setPenColor(128, 0, 255 );
		StdDraw.filledCircle(4, 0, 1);
		
		
	}
}