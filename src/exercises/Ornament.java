package exercises;

import java.util.Random;

/* 
 * Create a class called Decorator that contains an ArrayList called boxOfDecorations.
 *   1. In the Decorator class, hang all the ornaments in the box.
 *   2. Add a color to the Ornament class so that your program prints â€œHanging a red ornamentâ€�, etc.
 */

public class Ornament {
	
	String color;
	
	public Ornament() {
		Random randomcolor = new Random();
		String[] colors = {"Navajo white", "Amazon", "Artichoke", "Avocado", "Black", "Celtic blue"}; 
		this.color = colors[randomcolor.nextInt(colors.length)];
	}
	
	
	public void hang(){
		System.out.println("Hanging an " + color + " ornament");
	}

}
