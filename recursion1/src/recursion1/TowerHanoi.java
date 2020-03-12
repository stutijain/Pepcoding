package recursion1;

public class TowerHanoi {

	public static void main(String[] args) {
	toh("s","d","h",4);

	}
	public static void toh(String s,String d,String h,int n){
		if(n==0) return;
		toh(s,h,d,n-1);
		System.out.println(s+n+d);
		toh(h,d,s,n-1);
	}

}
