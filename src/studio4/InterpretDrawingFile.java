package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		//pink rectangle
		
		String shapeType = in.next();
		
		
		StdDraw.setPenRadius(1);
		
		int redComponent = in.nextInt();
		
		int blueComponent = in.nextInt();
		
		int greenComponent = in.nextInt();
		
		boolean isFilled = in.nextBoolean();
		
		double valX = in.nextDouble();
		
		double valY = in.nextDouble();
		
		double width = in.nextDouble();
		
		double height = in.nextDouble();
		 
		
		StdDraw.setPenColor(redComponent, blueComponent, greenComponent);
		
		if(isFilled == true) {
			
			StdDraw.filledRectangle(valX, valY, width, height);
		}
		
		else {
			
			StdDraw.rectangle(valX, valY, width, height);
		}
		
		
		
	}
}
