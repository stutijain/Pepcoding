import java.util.ArrayList;

public class getMazePath {

	
	public static void main(String[] args) {

		System.out.println(getMaze(0,0,2,2));
	}
	public static ArrayList<String> getMaze(int sx,int sy,int dx,int dy){
		if(sx==dx && sy==dy){
			ArrayList<String> bresult=new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		ArrayList<String> mresult=new ArrayList<>();
		ArrayList<String> rresult=new ArrayList<>();
		if(sx<dx){
			rresult=getMaze(sx+1,sy,dx,dy);
			for(String x:rresult){
				mresult.add("v"+x);
			}
		}
		if(sy<dy){
			rresult=getMaze(sx,sy+1,dx,dy);
			for(String x:rresult){
				mresult.add("h"+x);
			}
		}
		return mresult;
	}

}
