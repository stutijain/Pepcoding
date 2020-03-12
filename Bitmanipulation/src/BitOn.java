
public class BitOn {

	public static void main(String[] args) {
		int n=57;
		int k=3;
		
		int mask=1<<k;//only kth bit it is on
		if((n & mask) == 0) System.out.println("off");
		else System.out.println("on");
		
		System.out.println(Integer.toBinaryString(n|mask));//to set kth bit
		
		int revmask=~mask;//to turn off kth bit
		System.out.println(Integer.toBinaryString(n&revmask));
		
		System.out.println(Integer.toBinaryString(n^mask));
		
		//to print all the bits
		for(int i=31;i>=0;i--){
			int masknew=1<<i;
			if((n & masknew) == 0) System.out.print(0);
			else System.out.print(1);	
		}
		System.out.println();
		int s=1;
		int x=0;
        for(int i=31;i>=0;i--){
        	int maskn=1<<i;
        	x=x+(s^maskn);
        	System.out.print(x);
        }
		
	}

}
