
public class Merge {

	public static void main(String[] args) {
//		int[] one={10,20,30,40,50};
//		int[] two={11,15,22,33,45,56};
//
//	    int[] result=merge(one,two);
	    int[] result={4,8,3,7,1,2,0};
	    result=mergesort(result,0,result.length-1);
	    for(int i=0;i<result.length;i++) System.out.println(result[i]);
	}
	public static int[] mergesort(int[] arr,int lo,int hi){
		if(lo==hi){
			int[] ba=new int[1];
			ba[0]=arr[lo];
			return ba;
		}
		int mid=(lo+hi)/2;
		int[] lhs=mergesort(arr,lo,mid);
		int[] rhs=mergesort(arr,mid+1,hi);
		int[] ans= merge(lhs,rhs);
		return ans;
	}
	public static int[] merge(int[] one,int[] two){
		int i=0,j=0,k=0;
		int n=one.length+two.length;
		int[] res =new int[n];
		while(k<n){
		if(i<one.length && j<two.length){
			if(one[i]<=two[j]){
				res[k]=one[i];
				i++;
			}
			else{
				res[k]=two[j];
				j++;
			}
			k++;
		}
		else if(i<one.length){
			for(int s=i;s<one.length;s++){
				res[k]=one[s];
				k++;
			}
			
		}
		else if(j<two.length){
			for(int s=j;s<two.length;s++){
				res[k]=two[s];
				k++;
			}
		}
		}
		return res;
		
	}

}
