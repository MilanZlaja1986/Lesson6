package exercises;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: 
	 *       QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 */

	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
		System.out.println(reverseMe("QcXgW9w4wQd=v?hctaw/moc.ebutuoy"));
	}
	
//	public String reverseMe(String string) {
//		String reverseWord = "";
//		char[] stringWord = string.toCharArray();
//		for (int i = stringWord.length - 1; i >= 0; i--) {
//			reverseWord += stringWord[i];
//		}
//		return reverseWord;
//	}
	
	public String reverseMe(String string) {
		String reverseWord = "";
		char[] stringWord = string.toCharArray();
		for (int i = stringWord.length - 1; i >= 0; i--) {
			reverseWord += stringWord[i];
		}
		return reverseWord;
	}
	
	
}
