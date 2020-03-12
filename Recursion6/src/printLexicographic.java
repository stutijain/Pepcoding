
public class printLexicographic {

	public static void main(String[] args) {
		printlexicographic(1,1000);
		

	}
	public static void printlexicographic(int l,int r){
		if(l<=r){
			System.out.println(l);
		}
		else return;
		
		for(int i=0;i<10;i++){
			printlexicographic(l*10+i,r);
		}
		if(l<9){
			printlexicographic(l+1,r);
		}
		
	}

}
