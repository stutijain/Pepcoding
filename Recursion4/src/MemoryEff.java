
public class MemoryEff {

	static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void main(String[] args) {
		//printSSascii("abc","");
		//printKPC("347","");
		//printBpath(0,10,"");
		//System.out.println(count);
	   // printMaze(0,0,2,2,"");
	    printBpathmutinode(0,0,3,3,"");
	    System.out.println(count1);

	}
	public static void printSSascii(String ques,String asf){
		if(ques.length()==0){
			System.out.println(asf);
			return;
		}
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		printSSascii(roq,asf+ch);
		printSSascii(roq,asf+(int)ch);
		printSSascii(roq,asf);
	}
	public static void printKPC(String ques,String asf){
		if(ques.length()==0){
			System.out.println(asf);
			return;
		}
		char x=ques.charAt(0);
		String s=codes[x-'0'];
		String roq=ques.substring(1);
		for(int i=0;i<s.length();i++){
			printKPC(roq,asf+s.charAt(i));
		}
	}
	static int count=0;
	public static void printBpath(int s,int d,String asf){
		if(s==d){
			System.out.println(asf);
			count++;
			return;
		}
		
			for(int i=1;i<=6;i++){
				if(s+i<=d){
				printBpath(s+i,d,asf+i);
			}
		}
	}
	public static void printMaze(int sx,int sy,int dx,int dy,String asf){
		if(sx==dx && sy==dy){
			System.out.println(asf);
			return;
		}
		if(sx<dx){
			printMaze(sx+1,sy,dx,dy,asf+"v");
		}
		if(sy<dy){
			printMaze(sx,sy+1,dx,dy,asf+"h");
		}
	}
	static int count1=0;
	public static void printBpathmutinode(int sx,int sy,int dx,int dy,String asf){
		if(sx==dx && sy==dy){
			System.out.println(asf);
			count1++;
			return;
		}
		for(int i=1;i<=dy;i++){
			if(sy+i<=dy){
				printBpathmutinode(sx,sy+i,dx,dy,asf+"h"+i);
			}
		}
		for(int i=1;i<=dx;i++){
			if(sx+i<=dx){
				printBpathmutinode(sx+i,sy,dx,dy,asf+"v"+i);
			}
		}
		for(int i=1;i<=Math.min(dx, dy);i++){
			if(sx+i<=dx && sy+i<=dy){
				printBpathmutinode(sx+i,sy+i,dx,dy,asf+"d"+i);
			}
		}
	}

}
