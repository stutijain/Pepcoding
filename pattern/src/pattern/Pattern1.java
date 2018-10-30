package pattern;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int j=1;	
		for(int i=1;i<=n;i++){
			int k=1;
			while(k<=i){
				System.out.print(j+" ");
				j++;
				k++;
			}
			System.out.println();
		}

	}

}
