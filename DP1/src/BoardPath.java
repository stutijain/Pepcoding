import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
//		System.out.println(cbpR(0,10));
//		System.out.println(cpbM(0,10,new int[11]));
//		System.out.println(cpbT(0,10));
//		System.out.println(getBpath2d(new int[4][4 ]));
//		int[][] arr={
//				{1,0,2,0,3,0},{5,10,8,7,0,6},{3,0,1,1,2,0},{4,4,7,0,0,6},
//					{3,9,11,2,1,3},{8,0,4,4,6,9},{1,0,0,9,6,2}
//				
//		};
		
//		System.out.println(Cway(arr));
//		int[][] arr={
//				{2,5,0,8,7},
//				{3,6,0,3,2},
//				{0,4,7,7,9},
//				{1,8,0,0,10},
//				{5,3,2,0,0}
//		};
		int [][] arr={
				{5,1,3,2,3},
				{4,4,0,0,6},
				{6,4,1,1,2},
				{4,0,1,7,2},
				{5,1,0,0,3}
		};
		int[][] narr=goldmineprint(arr);
		int max=narr[0][0];
		for(int s=1;s<narr.length;s++){
			if(narr[s][0]>max){
				max=narr[s][0];
			}
		}
		for(int i=0;i<narr.length;i++){
			if(narr[i][0]==max){
				System.out.println(i);
				printpath(narr,"",i,0);
			}
		}
	}
	public static int cbpR(int s,int d){
		int count=0;
		if(s == d) return 1;
		for(int i=1;i<=6;i++){
			if(s+i<=d){
			count=count+cbpR(s+i,d);
			}
		}
		return count;
	}
	public static int cpbM(int s,int d,int[]qb){
		if(s==d) return 1;
		if(qb[s] != 0) return qb[s];
		int count=0;
		for(int i=1;i<=6;i++){
			if(s+i<=d){
				count=count+cpbM(s+i,d,qb);
				qb[s]=count;
			}
		}
		return qb[s];
		
	}
	public static int cpbT(int s,int d){
		int[] arr=new int[d+1];
		arr[d]=1;
		arr[d-1]=1;
		for(int i=d-2;i>=0;i--){
			for(int j=i+1;j<i+7;j++){
				if(j<=d){
				arr[i] += arr[j];
				}
			}
		}
		return arr[0];
	}
	public static int getBpath2d(int[][]arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			arr[i][n-1]=1;
			arr[n-1][i]=1;
		}
		for(int i=n-2;i>=0;i--){
			for(int j=n-2;j>=0;j--){
				arr[i][j]=arr[i+1][j]+arr[i][j+1];
			}
		}
		return arr[0][0];
	}
	
	public static int Cway(int[][]arr){
		int rows=arr.length;
		int col=arr[0].length;
		int[][] narr=new int[rows][col];
		
		narr[rows-1][col-1]=arr[rows-1][col-1];
		for(int i=col-2;i>=0;i--){
			narr[rows-1][i]=arr[rows-1][i]+narr[rows-1][i+1];
		}
		for(int i=rows-2;i>=0;i--){
			narr[i][col-1]=arr[i][col-1]+narr[i+1][col-1];
		}
		for(int i=rows-2;i>=0;i--){
			for(int j=col-2;j>=0;j--){
				narr[i][j]=Math.min(narr[i+1][j],narr[i][j+1])+arr[i][j];
			}
		}
		return narr[0][0];
	}
	public static int max(int... vals){//to calculate max of variable arguments(var args)
		int max=0;
		for(int i=0;i<vals.length;i++){
			if(vals[i]>max) max=vals[i];
		}
		return max;
	}
	public static int goldmine(int[][]arr){
		int rows=arr.length;
		int col=arr[0].length;
		int[][] narr=new int[rows][col];
		for(int i=0;i<rows;i++){
			narr[i][col-1]=arr[i][col-1];
		}
		
		for(int j=col-2;j>=0;j--){
			for(int i=rows-1;i>=0;i--){
				if(i==rows-1){
					narr[i][j]=arr[i][j]+Math.max(narr[i][j+1],narr[i-1][j+1]);
				}
				else if(i==0){
					narr[i][j]=arr[i][j]+Math.max(narr[i][j+1],narr[i+1][j+1]);
				}
				else{
					narr[i][j]=Math.max(narr[i][j+1],(Math.max(narr[i-1][j+1], narr[i+1][j+1])))+arr[i][j];
				}
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				System.out.print(narr[i][j]+" ");
			}
			System.out.println();
		}
		
		int max=narr[0][0];
		for(int i=1;i<rows;i++){
			if(narr[i][0]>max) max=narr[i][0];
		}
		return max;
		
	}
	//for printing path
	public static int[][] goldmineprint(int[][]arr){
		int rows=arr.length;
		int col=arr[0].length;
		int[][] narr=new int[rows][col];
		for(int i=0;i<rows;i++){
			narr[i][col-1]=arr[i][col-1];
		}
		
		for(int j=col-2;j>=0;j--){
			for(int i=rows-1;i>=0;i--){
				if(i==rows-1){
					narr[i][j]=arr[i][j]+Math.max(narr[i][j+1],narr[i-1][j+1]);
				}
				else if(i==0){
					narr[i][j]=arr[i][j]+Math.max(narr[i][j+1],narr[i+1][j+1]);
				}
				else{
					narr[i][j]=Math.max(narr[i][j+1],(Math.max(narr[i-1][j+1], narr[i+1][j+1])))+arr[i][j];
				}
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				System.out.print(narr[i][j]+" ");
			}
			System.out.println();
		}
		return narr;
		
	}
	public static void printpath(int[][]narr,String ssf,int i,int j){
		if(j==narr[0].length-1){
			System.out.println(ssf);
			return;
		}
		if(i==0){
			int m=max(narr[i][j+1],narr[i+1][j+1]);
			if(m==narr[i][j+1]){
				printpath(narr,ssf+" r",i,j+1);
			}
			if(m==narr[i+1][j+1]){
				printpath(narr,ssf+" d",i+1,j+1);
			}
		}
		else if(i==narr.length-1){
			int m=max(narr[i][j+1],narr[i-1][j+1]);
			if(m==narr[i][j+1]){
				printpath(narr,ssf+" r",i,j+1);
			}
			if(m==narr[i-1][j+1]){
				printpath(narr,ssf+" u",i-1,j+1);
			}
		}
		else{
			int m=max(narr[i][j+1],narr[i-1][j+1],narr[i+1][j+1]);
			if(m==narr[i][j+1]){
				printpath(narr,ssf+" r",i,j+1);
			}
			if(m==narr[i-1][j+1]){
				printpath(narr,ssf+" u",i-1,j+1);
			}
			if(m==narr[i+1][j+1]){
				printpath(narr,ssf+" d",i+1,j+1);
			}
		}
		
	}
	

}
