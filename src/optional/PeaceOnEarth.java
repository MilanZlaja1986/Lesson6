package optional;

import java.util.ArrayList;

public class PeaceOnEarth {
	public static void main(String[] args) {
		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('g');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('s');
		truth.add('#');
		truth.add('u');
		truth.add('#');
		truth.add('#');
		truth.add('c');
		truth.add('k');
		
		truth.remove(0);
		truth.remove(2);
		truth.remove(6);
		truth.remove(7);
		truth.remove(7);
		
		System.out.println(truth);

		/* TODO: Remove the hash symbols and print out the truth. */
		
		
	}
}
