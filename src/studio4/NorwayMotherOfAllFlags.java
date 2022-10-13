package studio4;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		StdDraw.setXscale(0, 33);
		StdDraw.setYscale(0, 20);
		StdDraw.setPenColor(0, 0, 139);
		StdDraw.filledRectangle(5.5, 10, 5.5, 10);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(16.5, 10, 5.5, 10);
		StdDraw.setPenColor(139, 0, 0);
		StdDraw.filledRectangle(27.5, 10, 5.5, 10);
		
	}

	public static void indonesia() {
		
		StdDraw.setXscale(0, 40);
		StdDraw.setYscale(0, 25);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(20, 18.75, 20, 6.25);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(20, 6.25, 20, 6.25);
	}

	public static void netherlands() {
		
		StdDraw.setXscale(0, 28);
		StdDraw.setYscale(0, 18);
		StdDraw.setPenColor(0, 0, 139);
		StdDraw.filledRectangle(14, 3, 14, 3);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(14, 9, 14, 3);
		StdDraw.setPenColor(139, 0, 0);
		StdDraw.filledRectangle(14, 15, 14, 3);
	}

	public static void poland() {
		
		StdDraw.setXscale(0, 40);
		StdDraw.setYscale(0, 25);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(20, 18.75, 20, 6.25);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(20, 6.25, 20, 6.25);
	}

	public static void thailand() {
		
		StdDraw.setXscale(0, 28);
		StdDraw.setYscale(0, 18);
		
		StdDraw.setPenColor(139, 0, 0);
		StdDraw.filledRectangle(14, 1.5, 14, 1.5);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(14, 4.5, 14, 1.5);
		
		StdDraw.setPenColor(0, 0, 139);
		StdDraw.filledRectangle(14, 9, 14, 3);
		
		StdDraw.setPenColor(139, 0, 0);
		StdDraw.filledRectangle(14, 16.5, 14, 1.5);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(14, 13.5, 14, 1.5);
	}

	public static void finland() {
		StdDraw.clear();
		StdDraw.setXscale(0, 28);
		StdDraw.setYscale(0, 18);
		
		StdDraw.setPenColor(0, 0, 139);
		StdDraw.filledRectangle(14, 9, 14, 3);
		StdDraw.filledRectangle(10, 9, 3, 9);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
