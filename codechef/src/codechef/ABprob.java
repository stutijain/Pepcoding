package codechef;
import java.util.Scanner;

public class ABprob {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int x=a-b;
		int rem=x%10;
		if(rem != 9) System.out.println(x+1);
		else if(rem==9) System.out.println(x-1);
	}

}
