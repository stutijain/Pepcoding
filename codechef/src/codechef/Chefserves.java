package codechef;
import java.util.Scanner;

public class Chefserves {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t!=0){
			int p1=scn.nextInt();
			int p2=scn.nextInt();
			int k=scn.nextInt();
	        int ans=chef(p1+p2,k);
	        if(ans==1) System.out.println("COOK");
	        else System.out.println("CHEF");
		}
	}
	public static int chef(int sum,int k){
		int z=k;
		int l=2*k;
		for(int i=0;i<k;i++){
			double y=(double)(sum-z)/l;
			if((int)y == y) return 1;
			z++;
		}
		return 0;
	}

}
