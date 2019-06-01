package optional;

import java.util.ArrayList;

public class LearningArrayLists {

	public static ArrayList<String> createArrayList() {
		
		return new ArrayList<String>();
	}
	
	private static int numberOfListItems = 0;

	public static int addToArrayList(ArrayList testList, String string) {
		
		testList.add(string);
		numberOfListItems++;
		return numberOfListItems;
	}

	public static int getNumberOfItems(ArrayList testList) {
		
		return testList.size();
	}

	public static Object getItem(ArrayList testList, int i) {
		
		return testList.get(i);
	}

	public static String iterateOver(ArrayList testList) {
		String str = "";
		for (Object object : testList) {
			str += object;
		}
		return str;
	}

	public static int findItemOnList(ArrayList testList, String string) {
		
		return testList.indexOf(string);
	}

	public static Object replaceItem(ArrayList testList, int i, String string) {
		testList.add(i, string);
		testList.remove(i + 1);
		return testList.get(i);
	}

	public static Object insertItem(ArrayList testList, int i, String string) {
		testList.add(i, string);
		return testList.get(i);
	}

	public static ArrayList<Integer> createTypedArrayList() {
		return new ArrayList<Integer>();
	}

	
	public static Integer addAllInteger(ArrayList<Integer> testList) {
		Integer counter = new Integer(0);
		for (Integer in : testList) {
			counter += in;
		}
		return counter;
	}

	public static ArrayList<String> createStringTypedArrayList() {
		return new ArrayList<String>();
	}

	public static String addAllString(ArrayList<String> testList) {
		String coun = "";
		for (String str : testList) {
			coun += str;
		}
		return coun;
	}

	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

	

	

}
