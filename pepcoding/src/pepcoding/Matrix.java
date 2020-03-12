package pepcoding;
import java.util.ArrayList;
public class Matrix {

	public static ArrayList<String> getPath(int sx,int sy,int dx,int dy){
		ArrayList<String> mresult=new ArrayList<>();
		if(sx==dx && sy==dy){
			ArrayList<String> bresult=new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		if(sx+1<=dx && sx<sy){
			ArrayList<String> rresult=getPath(sx+1,sy,dx,dy);
			for(String x:rresult){
				mresult.add("h"+x);
			}
		}
		if(sy+1<=dy){
			ArrayList<String> rresult1=getPath(sx,sy+1,dx,dy);
			for(String x:rresult1){
				mresult.add("v"+x);
			}
		}
		return mresult;
	}
	public static void main(String[] args) {
		System.out.println(getPath(0,0,3,3));
		System.out.println(getPath(0,0,5,5).size());

	}

}
