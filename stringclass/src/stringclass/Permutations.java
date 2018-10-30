package stringclass;

public class Permutations {

	public static int fact(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * fact(n - 1);
	}

	public static void printPermutation(String s) {
		int len = s.length();
		for (int i = fact(len) - 1; i >= 0; i--) {
			int n = i;
			int r;
			String s1=s;
			for (int k = len; k > 0; k--) {
				r = n % k;
				n = n / k;
				System.out.print(s1.charAt(r));
				s1 = s1.substring(0, r) + s1.substring(r + 1);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		printPermutation(s);

	}

}
