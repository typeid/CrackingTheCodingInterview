
public class Ex2 {
	static String reverseString(String base) {
		int j = 0;
		char[] reversedChars = base.toCharArray();
		for (int i = base.length() - 1 ; j < i; --i) {
			char x = reversedChars[j];
			reversedChars[j] = reversedChars[i];
			reversedChars[i] = x;
			++j;
		}
		return new String(reversedChars);
	}
//	public static void main(String args[]) {
//		String test = "tesla";
//		System.out.println(reverseString(test));
//	}
}
