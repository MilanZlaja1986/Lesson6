package optional;

import java.util.ArrayList;

public class BetterArrayList extends ArrayList<Object> {
	

	
	public static void main(String[] args) {
		
		ArrayList <Object> number = new ArrayList<Object>();
		number.add(1);
		number.add(3);
		number.add(5);
		number.add(7);
		number.add(9);
		System.out.println(number);
		
		number.size();
		
		number.remove(number.size()-1);
		System.out.println(number);
		
		
		
		
		
	}

}
