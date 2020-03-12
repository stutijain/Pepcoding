package twodarrays;

public class Matrixmult {

	public static void main(String [] args){
		int [][] one={
				{10,0,0},
				{0,5,1}
		};
		int [][] two={
				{0,5,10,0},
				{20,0,1,2},
				{1,1,1,5}
		};
	}
	public static void multiply(int[][] one,int [][] two){
		int r1=one.length;
		int c1=one[0].length;
		int r2=two.length;
		int c2=two[0].length;
		if(c1 != r2) System.out.println("cannot be multiplied");
		else{
			
		}
	}
}
