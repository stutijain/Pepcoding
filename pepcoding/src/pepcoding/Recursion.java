package pepcoding;
import java.util.ArrayList;

public class Recursion {
	public static ArrayList<String> getssascii(String s){
		if(s.length() == 0){
			ArrayList<String> bresult=new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		
		ArrayList<String> rresult=getssascii(ros);
		ArrayList<String> mresult=new ArrayList<>();
		for(String x:rresult){
				mresult.add(x);
				mresult.add(ch+x);
				mresult.add((int)(ch)+x);
				
		}
		return mresult;
		
	}

	public static void main(String[] args) {
		
     System.out.println(getssascii("ab")
    		 );
	}

}
