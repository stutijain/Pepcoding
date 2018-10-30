
public class TargetSum {

	public static void main(String[] args) {
//		int[] arr={5,2,4,6,3};
//		int tar=10;
//		boolean[][] narr=printset(arr,tar);
//		printpath(narr,arr,narr.length-1,narr[0].length-1,"");
		int w=7;
		int[]weights={2,5,1,3,4};
		int[]value={15,14,10,45,30};
		int[][]narr=knapsack(w,weights,value);
		printPath(narr,weights,value,narr.length-1,narr[0].length-1,"");
	}
	public static boolean[][] printset(int[]arr,int tar){
		boolean[][]narr=new boolean[arr.length+1][tar+1];
		for(int i=0;i<narr.length;i++){
			for(int j=0;j<narr[0].length;j++){
				if(i==0 && j==0){
					narr[i][j]=true;
				}
				else if(j==0){
					narr[i][j]=true;
				}
				else if(i==0){
					narr[i][j]=false;
				}
				else{
					if(narr[i-1][j]==true) narr[i][j]=true;
					else{
						int x=arr[i-1];
						if(j-x<0) narr[i][j]=false;
						else if(narr[i-1][j-x]==true) narr[i][j]=true;
					}
				}
			}
		}
		return narr;
		//System.out.println(narr[arr.length][tar]);
	}
	public static void printpath(boolean[][]narr,int[] arr,int i,int j,String ssf){
		if(i==0){
			if(j==0){
				System.out.println(ssf);
			}
			return;
		}
		if(narr[i-1][j]==true){
			printpath(narr,arr,i-1,j,ssf);
		}
		if(j-arr[i-1]>=0 && narr[i-1][j-arr[i-1]]==true){
			printpath(narr,arr,i-1,j-arr[i-1],ssf+" "+arr[i-1]);
		}
	}
	public static int[][] knapsack(int w,int[]weights,int[]values){
		int[][] narr=new int[weights.length+1][w+1];
		for(int i=0;i<narr.length;i++){
			for(int j=0;j<narr[0].length;j++){
				if(i==0||j==0) narr[i][j]=0;
				else{
					if(j-weights[i-1]>=0){
						narr[i][j]=Math.max(narr[i-1][j], values[i-1]+narr[i-1][j-weights[i-1]]);
					}
					else narr[i][j]=narr[i-1][j];
				}
			}
		}
		for(int i=0;i<narr.length;i++){
			for(int j=0;j<narr[0].length;j++){
				System.out.print(narr[i][j]+" ");
			}
			System.out.println();
		}
		return narr;
	}
	public static void printPath(int[][]narr,int[]weights,int[]values,int i,int j,String ssf){
		if(j==0 && i==0){
			System.out.println(ssf);
			return;
		}
		if(j-weights[i-1]>=0){
			int max=Math.max(narr[i-1][j],values[i-1]+narr[i-1][j-weights[i-1]]);
			if(max==narr[i-1][j]){
				printPath(narr,weights,values,i-1,j,ssf);
			}
			if(max==values[i-1]+narr[i-1][j-weights[i-1]]){
				printPath(narr,weights,values,i-1,j-weights[i-1],ssf+" "+weights[i-1]);
			}
		}else{
			printPath(narr,weights,values,i-1,j,ssf);
		}
		
	}

}
