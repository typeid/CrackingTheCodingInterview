import java.util.Arrays;

public class Ex3 {
	static boolean checkPermutation(String a, String b) {
		if (a.length() == b.length()) {
			char[] sortedA = a.toCharArray();
			Arrays.sort(sortedA);
			char[] sortedB = b.toCharArray();
			Arrays.sort(sortedB);
			return (Arrays.equals(sortedA, sortedB));

		}
		return false;
	}

	public static void main(String args[]) {
		String test = "tesla";
		String test2 = "alset";
		if (checkPermutation(test, test2)) {
			System.out.println("Permutation");

		} else
			System.out.println("No permutation");
	}
}
