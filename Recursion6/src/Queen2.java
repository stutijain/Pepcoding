
public class Queen2 {

	public static void main(String[] args) {
		boolean[][] boxes=new boolean[4][4];
		printnQueen(boxes,1,4,0,"");
		System.out.println(count);

	}
	static int count=0;
	public static void printnQueen(boolean[][] boxes,int bno,int tq,int cq,String asf){
		if(cq==tq){
			//if(isBvalid(boxes)==true){
				count++;
			System.out.println(asf);
			//}
			return;
		}	
		if(bno == boxes.length*boxes.length+1){
			return;
		}
		printnQueen(boxes,bno+1,tq,cq,asf);
		int row=(bno-1)/boxes.length;
		int col=(bno-1)%boxes.length;
		
	    if(boxes[row][col] == false && isQsafe(boxes,row,col)){
	    	boxes[row][col]=true;
	    	printnQueen(boxes,bno+1,tq,cq+1,asf+bno+"-");
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
	//use proactive approach of radius
	public static boolean isQsafe(boolean[][] boxes,int i,int j){
		for(int k=0;k<boxes.length;k++){
			if(k != j){
			if(boxes[i][k]==true) return false; 
			}
			
		}
		for(int k=0;k<boxes.length;k++){
			if(k!=i){
			if(boxes[k][j]==true) return false;
			}
			
		}
		for(int k=0;k<boxes.length;k++){
			if(i+k<boxes.length && j+k<boxes.length && i+k>=0 && j+k>=0 && i+k!=i && j+k!=j){
			if(boxes[i+k][j+k]==true) return false;
			}
		}
		for(int k=0;k<boxes.length;k++){
			if(i+k<boxes.length && j-k<boxes.length && i+k>=0 && j-k>=0 && i+k!=i && j-k!=j){
			if(boxes[i+k][j-k]==true) return false;
			}
		}
		for(int k=0;k<boxes.length;k++){
			if(i-k<boxes.length && j+k<boxes.length && i-k>=0 && j+k>=0 && i-k!=i && j+k!=j){
			if(boxes[i-k][j+k]==true) return false;
			}
		}
		for(int k=0;k<boxes.length;k++){
			if(i-k<boxes.length && j-k<boxes.length && i-k>=0 && j-k>=0 && i-k!=i && j-k!=j){
			if(boxes[i-k][j-k]==true) return false;
			}
		}
		
		return true;
	}

}
