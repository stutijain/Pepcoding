
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=43;
		System.out.println(Fibmemo(n,new int[n+1]));
		System.out.println(FibT(n));

	}
	public static int Fibmemo(int n,int[]qb){
		if(n==0 || n==1) return n;
		
		if(qb[n] != 0) return qb[n];
		
		int fm1=Fibmemo(n-1,qb);
		int fm2=Fibmemo(n-2,qb);
		int fn=fm1+fm2;
		
		qb[n]=fn;
		return fn;
	}
	public static int FibT(int n){
		int[] arr=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=n;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
		
	}

}
