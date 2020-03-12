
public class InverseArray {

	public static void main(String[] args) {
		int []arr={3,4,2,1,0};
		inverse(arr,0);//without forming another array
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
	}
	public static void inverse(int[]arr,int vidx){
		if(vidx==arr.length){
			return;
		}
		int x=arr[vidx];
		int y=arr[x];
		int z=arr[y];
		inverse(arr,vidx+1);
		arr[vidx]=z;
	}

}
