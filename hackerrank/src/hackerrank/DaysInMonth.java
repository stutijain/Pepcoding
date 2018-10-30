package hackerrank;

public class DaysInMonth {

	public static void main(String[] args) {
		int d=28;
		String day="mon";
		String[] word={"mon","tues","wed","thurs","fri","sat","sun"};
//		int[] ans=findDay(d,day);
//		for(int i=0;i<ans.length;i++) System.out.println(ans[i]);
		int n=0;
		int []ans=new int[7];
		for(int i=0;i<word.length;i++){
			if(word[i].equals(day)) n=i;
		}
	int suml=1;
		for(int i=n;i<n+7;i++){
			int sum=suml;
			int count=0;
			while(sum<=d){
				sum=sum+7;
				count++;
			}
			ans[i%7]=count;
			suml++;
		}
		
		for(int i=0;i<ans.length;i++) System.out.println(ans[i]);
		

	}
	

}
