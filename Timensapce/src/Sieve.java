import java.util.Arrays;

public class Sieve {

	public static void main(String[] args) {
		sieve(100);

	}
	public static void sieve(int n){
		boolean[] arr=new boolean[n+1];
		Arrays.fill(arr, true);
		arr[0]=false;
		arr[1]=false;
		
		for(int i=2;i*i<=n;i++){
			if(arr[i]==true){
			for(int j=i;j*i<=n;j++){
				arr[i*j]=false;
			}
			}
		}
		for(int i=0;i<=n;i++){
			if(arr[i]==true) System.out.println(i);
		}
	}

}
