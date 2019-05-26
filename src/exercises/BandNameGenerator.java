package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {
	
	public static void main(String[] args) {
		
		ArrayList<String>adjectives = new ArrayList<String>();
		ArrayList<String>pluralNouns = new ArrayList<String>();
		
		adjectives.add("short");
		adjectives.add("streched");
		adjectives.add("curly");
		
		pluralNouns.add("shorts");
		pluralNouns.add("pants");
		pluralNouns.add("computers");
		
		int r1 = new Random().nextInt(3);
		int r2 = new Random().nextInt(3);
	//	System.out.println(r1);
		
		System.out.println("The " + adjectives.get(r1) + " " + pluralNouns.get(r2));
		
	}
	


}
