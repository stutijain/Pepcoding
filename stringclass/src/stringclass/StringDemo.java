package stringclass;

public class StringDemo {

	public static void main(String[] args) {
		String s = "hello";
		print(s);
		printAllSubstrings(s);
		boolean ans = isPalindrome(s);
		System.out.println(ans);
		printAllPalindrome(s);

	}

	public static void print(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printAllSubstrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else
				return false;
		}
		return true;
	}

	public static void printAllPalindrome(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String a = s.substring(i, j);
				if (isPalindrome(a))
					System.out.println(a);
				else
					continue;
			}
		}
	}

}
