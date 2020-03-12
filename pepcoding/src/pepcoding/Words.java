package pepcoding;
import java.util.ArrayList;

public class Words {

	public static String[] codes={"yz","abc","de","fghi","jk","lmn","opq","rst","uv","wx"};
	public static ArrayList<String> getKPC(String s){
		
		if(s.length()==0){
			ArrayList<String> bresult=new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		
		char ch=s.charAt(0);
		String index=codes[ch-'0'];
		String ros=s.substring(1);
		
		
		ArrayList<String> rresult=getKPC(ros);
		
		ArrayList<String> mresult=new ArrayList<>();
		for(String x:rresult){
			for(int i=0;i<index.length();i++){
				mresult.add(index.charAt(i)+x);
				
			}
		}
		return mresult;
		
	}
	public static void main(String[] args) {
		System.out.println(getKPC("781"));

	}

}
