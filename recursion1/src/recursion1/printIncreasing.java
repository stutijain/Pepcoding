package recursion1;

public class printIncreasing {

	public static void main(String[] args) {
		printIncreasing(5);
		f(3);
 
	}
	public static void printIncreasing(int n){
		if(n==0){
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}
	public static void f(int n){
		if(n==0){
			return;
		}
		System.out.println(n);
		f(n-1);
		System.out.println(n);
	}

}
