
public class Twounique {

	public static void main(String[] args) {
		int[] arr={5,9,9,7,8,7,6,5};
		twounique(arr);
	}
	public static void twounique(int[]arr){
		int xyz=0;
		for(int i=0;i<arr.length;i++){
			xyz ^= arr[i];
		}
		int mask=(xyz & -xyz);
		int x=0;
		int y=0;
		for(int i=0;i<arr.length;i++){
			if((mask&arr[i]) == 0) x ^= arr[i];
			else y ^= arr[i];
		}
		System.out.println(x+" "+y);
	}

}
