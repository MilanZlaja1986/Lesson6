package exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if (egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	static String findLongestWord(List<String> words) {
		String longestWord = "a";
		for (String s : words) {
			System.out.println(s.length());
			if (s.length() > longestWord.length()) {
//				System.out.println(s);
				// Update longest word
				longestWord = s;
			}

		}
		return longestWord;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int count = 0;

		// foreach boolean in oysters
		for (Boolean boolean1 : oysters) {
			System.out.println(boolean1);
			if (boolean1 == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {

		double height = 0.0;

		for (Double double1 : peeps) {
			if (double1 > height) {
				System.out.println(double1);
				height = double1;
			}
		}
		return height;
	}

	public static boolean containsSOS(List<String> message) {

		for (int i = 0; i < message.size(); i++) {
			String sos = message.get(i);
			if (sos.contains("... --- ...")) {
				return true;
			}

		}

		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		results.sort(new Comparator<Double>() {

			@Override
			public int compare(Double d1, Double d2) {
				return Double.compare(d1, d2);
			}
			
		});
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		unsortedSequences.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s1.length() - s2.length());
			}
		});
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		words.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return (s1.length() - s2.length());
			}});
		return words;
	}
	
	
	
	

	
}
