import java.util.ArrayList;

public class GetssAscii {

	public static void main(String[] args) {
		String s="ab";
		System.out.println(getAscii(s));
	}
	public static ArrayList<String> getAscii(String s){
		if(s.length()==0){
			ArrayList<String> bresult=new ArrayList<>();
			bresult.add(" ");
			return bresult;
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		
		ArrayList<String> rresult=getAscii(ros);
		ArrayList<String> mresult=new ArrayList<>();
		
		for(String x:rresult){
			mresult.add("_"+x);
			mresult.add(ch+x);
			mresult.add((int)(ch)+x);
			
	}
		return mresult;
	}

}
