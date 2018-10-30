
public class highestfreq {

	public static void main(String[] args) {
		hfc("aabbccddaa");
	}
	public static void hfc(String word){
		int[] arr=new int[26];
		
		for(int i=0;i<word.length();i++){
			int x=(int)(word.charAt(i))-97;
			arr[x] +=1;
		}
		int max=0;
		for(int i=0;i<26;i++){
			if(arr[i]>arr[max]) max=i;
		}
		System.out.println((char)(max+97));
	}

	
}
