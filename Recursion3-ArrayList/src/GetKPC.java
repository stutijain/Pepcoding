import java.util.ArrayList;

public class GetKPC {

	static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void main(String[] args) {
		String s="347";
		System.out.println(getKPC(s));

	}
	public static ArrayList<String> getKPC(String key){
		if(key.length()==0){
			ArrayList<String> bresult=new ArrayList<>();
			bresult.add(" ");
			return bresult;
		}
		char x=key.charAt(0);
		String s=codes[x-'0'];
		String ros=key.substring(1);
		
		ArrayList<String> rresult=getKPC(ros);
		ArrayList<String> mresult=new ArrayList<>();
		for(String res:rresult){
			for(int i=0;i<s.length();i++){
				mresult.add(res+s.charAt(i));
			}
		}
		return mresult;
		
	}

}
