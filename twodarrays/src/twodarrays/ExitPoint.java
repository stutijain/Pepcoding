package twodarrays;

public class ExitPoint {

	public static void main(String[] args) {
		int[][] maze={
				{0,0,1,0},
				{1,0,0,0},
				{0,0,0,0},
				{1,0,1,0}
		};
		int r=0;
		int c=0;
		int dir=0; //0->east,1->south,2->west,3->north
		
		while(true){
			dir=(dir+maze[r][c])%4;
			int nr=r;
			int nc=c;
			if(dir==0){
				nc++;
			}
			else if(dir==1){
				nr++;
			}
			else if(dir==2){
				nc--;
			}
			else if(dir==3){
				nr--;
			}
			
			if(nr<0 || nr>=maze.length || nc<0 || nc>=maze[0].length){
				System.out.println(r+" "+c);
				break;
			}
			else{
				r=nr;
				c=nc;
			}
		}
		

	}

}
