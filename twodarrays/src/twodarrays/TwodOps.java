package twodarrays;
import java.util.Scanner;
public class TwodOps {

	public static void display(int [][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		}
	}
	private static int[][] takeInput(){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows=scn.nextInt();
		int [][] arr=new int[rows][];
		for(int row=0;row<arr.length;row++){
			System.out.println("enter no. of columns for" + row + "th row");
			int cols=scn.nextInt();
			arr[row]=new int[cols];
			
			for(int col=0;col<arr[row].length;col++){
				System.out.println("enter the value of [" + row +","+col+"] th cell" );
				arr[row][col]=scn.nextInt();
			}
			
		}
		return arr;
		
	}
	public static void main(String[] args){
		int[][] arr=takeInput();
		display(arr);
	}
}
