
public class nKnights {

	public static void main(String[] args) {
		boolean[][] boxes=new boolean[3][3];
		printnKnight(boxes,1,3,0,"");
		System.out.println(count);

	}
	static int count=0;
	public static void printnKnight(boolean[][] boxes,int bno,int tk,int ck,String asf){
		if(ck==tk){
			
			//if(isBvalid(boxes)==true){//reactive approach
				count++;
			System.out.println(asf);
			//}
			return;
		}	
		if(bno == boxes.length*boxes.length+1){
			return;
		}
		printnKnight(boxes,bno+1,tk,ck,asf);
		int row=(bno-1)/boxes.length;
		int col=(bno-1)%boxes.length;
		
	    if(boxes[row][col] == false && isQsafe(boxes,row,col)==true){//proactive approach
	    	boxes[row][col]=true;
	    	printnKnight(boxes,bno+1,tk,ck+1,asf+bno+"-");
	    	boxes[row][col]=false;
	    }
	}
	public static boolean isBvalid(boolean[][] boxes){
		for(int i=0;i<boxes.length;i++){
			for(int j=0;j<boxes.length;j++){
				if(boxes[i][j]==true){
					if(isQsafe(boxes,i,j)==false) return false;
				}
			}
		}
		return true;
	}
	public static boolean isQsafe(boolean[][] boxes,int i,int j){
		int[][] dirs={
				{-2,+1},
				{+2,+1},
				{-2,-1},
				{+2,-1},
				{-1,+2},
				{+1,+2},
				{-1,-2},
				{+1,-2}
				
		};
		for(int[] dir:dirs){
			int ren=i+dir[0];
			int cen=j+dir[1];
			if(ren>=0 && ren<boxes.length && cen>=0 && cen<boxes.length && boxes[ren][cen]==true){
				return false;
			}
		}
		return true;
	}

}
