
public class Floodfill {

	public static void main(String[] args) {
		int[][]arr={{0,1,0,0,0,0,0,0},
				    {0,1,0,1,1,1,1,0},
				    {0,0,0,1,1,0,0,0},
				    {0,1,0,0,0,0,1,1},
				    {0,1,0,1,1,0,1,1},
				    {0,1,0,0,0,0,0,0}
		};
		boolean [][] visited=new boolean[6][8];
		
		
		Floodfill(arr,visited,0,0,"");

	}
	public static void Floodfill(int[][] arr,boolean[][] visited,int sr,int sc,String asf){
		if(sr==arr.length-1 && sc==arr[0].length-1){
			System.out.println(asf);
			return;
		}
		if(sc<arr[0].length-1 && arr[sr][sc+1] != 1 && visited[sr][sc+1]==false){
			visited[sr][sc+1]=true;
			Floodfill(arr,visited,sr,sc+1,asf+"r");
			visited[sr][sc+1]=false;
		}
		if(sr<arr.length-1 && arr[sr+1][sc] != 1 && visited[sr+1][sc]==false){
			visited[sr+1][sc]=true;
			Floodfill(arr,visited,sr+1,sc,asf+"d");
			visited[sr+1][sc]=false;
		}
		if(sc>0 && arr[sr][sc-1] != 1 && visited[sr][sc-1]==false){
			visited[sr][sc-1]=true;
			Floodfill(arr,visited,sr,sc-1,asf+"l");
			visited[sr][sc-1]=false;
		}
		if(sr>0 && arr[sr-1][sc] != 1 && visited[sr-1][sc]==false){
			visited[sr-1][sc]=true;
			Floodfill(arr,visited,sr-1,sc,asf+"t");
			visited[sr-1][sc]=false;
		}
	}

}
