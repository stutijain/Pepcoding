
public class Queen {

	public static void main(String[] args) {
		boolean[] boxes=new boolean[5];
		//printPermutation(boxes,2,0,"");
		//System.out.println(count);
		//printCombination(boxes,0,2,0,"");
		//printCombination2(boxes,2,0,0,"");
		printbitmask(0,4,2,0,"");
		System.out.println(count);
	}
	static int count=0;
	public static void printPermutation(boolean[] boxes,int tq,int cq,String asf){
		if(cq==tq){
			System.out.println(asf);
			count++;
			return;
		}
		for(int i=0;i<boxes.length;i++){
			if(boxes[i]==false){
				boxes[i]=true;
				printPermutation(boxes,tq,cq+1,asf+"q"+cq+"b"+i);
				boxes[i]=false;
			}
		}
	}
	//choice of queens
	public static void printCombination(boolean[] boxes,int k,int tq,int cq,String asf){
		if(cq==tq){
			System.out.println(asf);
			count++;
			return;
		}
		
		for(int i=k;i<boxes.length;i++){
			if(boxes[i]==false){
				boxes[i]=true;
				printCombination(boxes,i+1,tq,cq+1,asf+"q"+cq+"b"+i);
				boxes[i]=false;
			}
		}
		
	}
	public static void printbitmask(int boxbm,int tb,int tq,int cq,String asf){
		if(cq==tq){
			System.out.println(asf);
			count++;
			return;
		}
		for(int i=0;i<tb;i++){
			if((boxbm & (1<<i)) == 0){
				boxbm ^= (1<<i);
				printbitmask(boxbm,tb,tq,cq+1,asf+"q"+cq+"b"+i);
				boxbm ^= (1<<i);
			}
		}
	}
	//choice of boxes
	public static void printCombination2(boolean[] boxes,int tq,int cq,int cb,String asf){
		if(cq==tq){
			System.out.println(asf);
			count++;
			return;
		}
		if(cb==boxes.length){
			return;
		}
		
		printCombination2(boxes,tq,cq,cb+1,asf);//queen not placed
		if(boxes[cb]==false){
			boxes[cb]=true;
			printCombination2(boxes,tq,cq+1,cb+1,asf+"q"+cq+"b"+cb);//queen placed
			boxes[cb]=false;
		}	
	}

}
