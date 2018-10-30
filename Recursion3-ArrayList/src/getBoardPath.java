import java.util.ArrayList;

public class getBoardPath {

	public static void main(String[] args) {
		System.out.println(getBPath(0,10));

	}
	public static ArrayList<String> getBPath(int s,int d){
		if(s==d){
			ArrayList<String> bresult=new ArrayList<>();
			bresult.add(" ");
			return bresult;
		}
		ArrayList<String> mresult=new ArrayList<>();
		if(s<=d){
			for(int i=1;i<=6;i++){
				ArrayList<String> ways=getBPath(s+i,d);
				for(String x:ways){
					mresult.add(i+x);
				}
			}
		}
		
		
	 return mresult;
		
	}

}
