package studio4;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import org.w3c.dom.css.RGBColor;

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
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		Color color = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(color);
		boolean filled = in.nextBoolean();
		
		if(shapeType.equals("ellipse")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double semiMajorAxis = in.nextDouble();
			double semiMinorAxis = in.nextDouble();
			if(filled == true) {
				StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
			} else if (filled == false) {
				StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
			}
		}  else if (shapeType.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if (filled == true) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			} else if (filled == false) {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}	
		} else if (shapeType.equals("triangle")) {
			double[] x = new double [3];
			double[] y = new double [3];
			for (int i = 0; i<3; i++) {
				x[i] = in.nextDouble();
				y[i] = in.nextDouble();
			}
			if (filled == true) {
				StdDraw.filledPolygon(x, y);
			} else if (filled == false) {
				StdDraw.polygon(x, y);
			}
			
		}
		
		
	}
}
