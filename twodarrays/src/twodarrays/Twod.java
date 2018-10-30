package twodarrays;

public class Twod {

	public static void main(String[] args){
		int [][] arr=null;
		arr=new int[2][4];
		int [][] jagged=new int[2][];
		jagged[0]=new int[3];
		jagged[1]=new int[5];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		arr[1][3]=100;
		System.out.println(arr[1][3]);
	}
}
