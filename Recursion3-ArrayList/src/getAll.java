import java.util.ArrayList;

public class getAll {

	public static void main(String[] args) {
		String s="1123";
		System.out.println(getAllWays(s));
	}
	public static ArrayList<String> getAllWays(String key){
		if(key.length()==0){
			ArrayList<String> bresult=new ArrayList<>();
			bresult.add(" ");
			return bresult;
		}
		char ch=(char)((int)key.charAt(0)+48);
		String rem=key.substring(1);
		String str="";
		String rem2="";
		char ch2='\0';		
		ArrayList<String> rresult=getAllWays(rem);
		ArrayList<String> rresult2=new ArrayList<>();
		if(key.length()>=2){
			 str=key.substring(0, 2);
			 ch2=(char)((Integer.parseInt(str)+96));
			 if((int)ch2<=122 && (int)ch2>=97){
			 rem2=key.substring(2);
			 rresult2=getAllWays(rem2);
			 }
			 }
		ArrayList<String> mresult=new ArrayList<>();
		for(String res:rresult){
			mresult.add(ch+res);
		}
		for(String res2:rresult2){
			mresult.add(ch2 +res2);
		}
		return mresult;
		
		
	}
//	public static ArrayList<String> getPat(String key){
//		if(key.length()==0){
//			ArrayList<String> bresult=new ArrayList<>();
//			bresult.add(" ");
//			return bresult;
//		}
//		char ch=key.charAt(0);
//		String rem=key.substring(1);
//		
//		ArrayList<String> rresult=getPat(rem);
//		ArrayList<String> mresult=new ArrayList<>();
//		for(String res:rresult){
//			mresult.add(ch+"+"+res);
//		}
//		System.out.println(mresult.size());
//		return mresult;
//	}
//	public static ArrayList<String> getPat2(String key){
//		if(key.length()==0){
//			ArrayList<String> bresult=new ArrayList<>();
//			bresult.add(" ");
//			return bresult;
//		}
//		ArrayList<String> mresult=new ArrayList<>();
//		String str=key.substring(0, 2);
//		String rem2=key.substring(2);
//		ArrayList<String> rresult2=getPat(rem2);
//		for(String res2:rresult2){
//			mresult.add(str+"+"+res2);
//		}
//		System.out.println(mresult.size());
//		return mresult;
//	}

}
