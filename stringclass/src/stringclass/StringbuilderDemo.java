package stringclass;

public class StringbuilderDemo {

	public static String compress1(String s) {
		int i = 0;
		StringBuilder str = new StringBuilder("");
		while (i < s.length() - 1) {
			if (s.charAt(i) == s.charAt(i + 1)) {
			} else
				str.append(s.charAt(i));
			i++;
		}
		str.append(s.charAt(s.length()-1));
		return str.toString();
	}
	public static String compress2(String s){
		int i = 0;
		int val=1;
		StringBuilder str = new StringBuilder("");
		while (i < s.length() - 1) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				val++;
			} else{
				str.append(s.charAt(i));
				str.append(val);
				val=1;}
			i++;
		}
		str.append(s.charAt(s.length()-1));
		str.append(val);
		return str.toString();
	}
	public static String modify(String s){
		StringBuilder str=new StringBuilder("");
		for(int i=0;i<s.length();i++){
			int at=(int)s.charAt(i);
			if(at>=65 && at<=90){
				str.append((char)(at+32));
			}
			else if(at>=97 && at<=122){
				str.append((char)(at-32));
			}
		}
		return str.toString();
	}
	
	public static String modify2(String s){
		StringBuilder str=new StringBuilder("");
		for(int i=0;i<s.length();i++){
			if(i%2==0){
				int at=(int)s.charAt(i);
				str.append((char)(at+1));
			}
			else{
				int at=(int)s.charAt(i);
				str.append((char)(at-1));
			}
		}
		return str.toString();
	}
	
	public static String modify3(String s){
		StringBuilder str=new StringBuilder("");
		for(int i=0;i<s.length()-1;i++){
			int diff=(int)s.charAt(i+1)-(int)s.charAt(i);
			str.append(s.charAt(i));
			str.append(diff);
		}
		str.append(s.charAt(s.length()-1));
		return str.toString();
	}

	public static void main(String[] args) {
		String s = "adebg";
		System.out.println(compress1(s));
		System.out.println(compress2(s));
		System.out.println(modify(s));
		System.out.println(modify2(s));
		System.out.println(modify3(s));

	}

}
