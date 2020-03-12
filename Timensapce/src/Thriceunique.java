
public class Thriceunique {

	public static void main(String[] args) {
		int[] arr={5,9,9,7,10,5,7,9,5,7};
		thriceunique(arr); //O(n)

	}
	public static void thriceunique(int[]arr){
		int uni=0;
		for(int i=0;i<32;i++){
			int count=0;
			int bm=1<<i;
			for(int j=0;j<arr.length;j++){
				
				if((arr[j]&bm)==bm) count++;
			}
			if(count%3 != 0) uni=uni|(1<<i);
		}
		System.out.println(uni);
	}

}
