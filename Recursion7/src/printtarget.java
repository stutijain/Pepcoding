import java.util.ArrayList;

public class printtarget {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int tar = 50;
		// printTargetSS1(arr,tar,0,0,"");
		ArrayList<Integer> ssf = new ArrayList<>();
		// printTargetSS2(arr,tar,0,0,ssf);
		//equiSet(arr, 0, new ArrayList<Integer>(), 0, new ArrayList<Integer>(), 0);
		printQues("abc","");
		//printQ(new StringBuilder("abc"),new StringBuilder(""));

	}

	public static void printTargetSS1(int[] arr, int tar, int vidx, int sosf, String ssf) {
		if (sosf == tar) {
			System.out.println(ssf);
			return;
		}
		if (vidx == arr.length) {
			return;
		}
		printTargetSS1(arr, tar, vidx + 1, sosf + arr[vidx], ssf + " " + arr[vidx]);
		printTargetSS1(arr, tar, vidx + 1, sosf, ssf);
	}

	static int sosf = 0;

	public static void printTargetSS2(int[] arr, int tar, int vidx, int sosf, ArrayList<Integer> ssf) {
		if (vidx == arr.length) {
			if (sosf == tar) {
				System.out.println(ssf);
			}
			return;
		}

		ssf.add(arr[vidx]);
		printTargetSS2(arr, tar, vidx + 1, sosf + arr[vidx], ssf);
		ssf.remove(ssf.size() - 1);
		printTargetSS2(arr, tar, vidx + 1, sosf, ssf);
	}

	public static void equiSet(int[] arr, int vidx, ArrayList<Integer> set1, int sos1, ArrayList<Integer> set2,
			int sos2) {
		if (vidx == arr.length) {
			if (sos1 == sos2) {
				System.out.print(set1);
				System.out.print(set2);
				System.out.println();
			}
			return;
		}
		set1.add(arr[vidx]);
		equiSet(arr, vidx + 1, set1, sos1 + arr[vidx], set2, sos2);
		set1.remove(set1.size() - 1);
		set2.add(arr[vidx]);
		equiSet(arr, vidx + 1, set1, sos1, set2, sos2 + arr[vidx]);
		set2.remove(set2.size() - 1);

	}
	//answer has a choice
	public static void printPerm1(String q,String a){
		if(q.length()==0){
			System.out.println(a);
			return;
			
		}
		char ch=q.charAt(0);
		String ros=q.substring(1);
		
		for(int i=0;i<=a.length();i++){
			String s1=a.substring(0,i);
			String s2=a.substring(i);
			printPerm1(ros,s1+ch+s2);
		}
	}
	public static void printPerm2(StringBuilder q,StringBuilder a){
		if(q.length()==0){
			System.out.println(a);
			return;
		}
		char ch=q.charAt(0);
		String ros=q.substring(1);
		
		q.deleteCharAt(0);
		for(int i=0;i<=a.length();i++){
			a.insert(i,ch);
			printPerm2(q,a);
			a.deleteCharAt(i);
		}
		q.insert(0,ch);
		
	}
	//question has a choice
	public static void printQ(StringBuilder q,StringBuilder a){
		if(q.length()==0){
			System.out.println(a);
			return;
		}
		
		for(int i=0;i<q.length();i++){
			char ch=q.charAt(i);
			a.append(q.charAt(i));
			q.deleteCharAt(i);
			printQ(q,a);
			q.insert(i, ch);
			a.deleteCharAt(a.length()-1);
		}
	}
	public static void printQues(String q,String a){
		if(q.length()==0){
			System.out.println(a);
			return;
		}
		for(int i=0;i<q.length();i++){
			char ch=q.charAt(i);
			String s1=q.substring(0,i);
			String s2=q.substring(i+1);
			printQues(s1+s2,a+ch);
		}
	}

}
