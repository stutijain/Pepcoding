package pepcoding;
import java.util.ArrayList;

public class Ways {

	public static ArrayList<String> getBoardPath(int src,int dest){
		ArrayList<String> mresult=new ArrayList<>();
		for(int i=1;i<=6;i++){
			if(src+i <= dest){
				ArrayList<String> path=getBoardPath(src+i,dest);
				for(String x:path){
					mresult.add(i+x);
				}
			}
			if(src == dest){
				ArrayList<String> bresult=new ArrayList<>();
				bresult.add("");
				return bresult;
			}
		}
		return mresult;
	}
	public static void main(String[] args) {
		
		System.out.println(getBoardPath(0,10));
	}

}
