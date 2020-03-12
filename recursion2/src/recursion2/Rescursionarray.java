package recursion2;

public class Rescursionarray {

	public static void main(String[] args) {
		int[] arr = { 11, 4, 9, 9, 9, 2 };
		displayR(arr, 0);
		System.out.println(factorial(5));
		System.out.println(spower(2, 5));
		System.out.println(max(arr, 0));
		System.out.println(find(arr, 0, 2));
		System.out.println(firstIndex(arr, 0, 9));
		System.out.println(lastIndex(arr, 0, 9));
		int[] ans = allIndices(arr, 0, 9, 0);
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i]);
	}

	public static void displayR(int[] arr, int vidx) {
		if (vidx == arr.length)
			return;
		displayR(arr, vidx + 1);
		System.out.println(arr[vidx]);
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1)
			return 1;

		return n * factorial(n - 1);
	}

	// complexity=logn
	public static int spower(int x, int n) {
		if (n == 0)
			return 1;
		int p = spower(x, n / 2);
		if (n % 2 == 0) {
			return p * p;
		} else
			return p * p * x;
	}

	public static int max(int[] arr, int vidx) {
		if (vidx == arr.length - 1)
			return arr[vidx];
		int x = max(arr, vidx + 1);
		if (arr[vidx] > x)
			return arr[vidx];
		return x;
	}

	public static boolean find(int[] arr, int vidx, int data) {
		if (vidx == arr.length)
			return false;
		if (arr[vidx] == data)
			return true;
		else
			return find(arr, vidx + 1, data);
	}

	public static int firstIndex(int[] arr, int vidx, int data) {
		if (vidx == arr.length)
			return -1;
		if (arr[vidx] == data)
			return vidx;
		else
			return firstIndex(arr, vidx + 1, data);
	}

	public static int lastIndex(int[] arr, int vidx, int data) {
		if (vidx == arr.length)
			return -1;
		int x = lastIndex(arr, vidx + 1, data);
		if (x == -1)
			if (arr[vidx] == data)
				return vidx;
		return x;
		// if (arr[vidx] == data) {
		// if (vidx < lastIndex(arr, vidx + 1, data))
		// return lastIndex(arr, vidx + 1, data);
		// else
		// return vidx;
		// }
		// return lastIndex(arr, vidx + 1, data);
	}

	public static int[] allIndices(int[] arr, int vidx, int data, int foundsofar) {
		if (vidx == arr.length) {
			return new int[foundsofar];
		}
		int[] ans = null;
		if (arr[vidx] == data) {
			ans = allIndices(arr, vidx + 1, data, foundsofar + 1);
			ans[foundsofar] = vidx;
		} else
			ans = allIndices(arr, vidx + 1, data, foundsofar);

		return ans;
	}

}
