package optional;

public class Inserting {

	public static int[] insertAt(int[] array, int in, int j) {
		int[] testArray = new int[array.length + 1];
		for (int i = 0; i < array.length + 1; i++) {
			if (i == in)
				testArray[in] = j;
			else if (i > in)
				testArray[i] = array[i - 1];
			else
				testArray[i] = array[i];
		}
		return testArray; 
	}

	public static String[] insertAlphabetically(String[] array, String string) {
		String[] orderedArray = new String[array.length + 1];
		for (int i = 0; i < orderedArray.length; i++) {
			orderedArray[i] = array[i];
			orderedArray[array.length] = string;
			Sorting.sort(orderedArray);
		} 
		return orderedArray;
	}


}
