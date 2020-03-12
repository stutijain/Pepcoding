
public class Quick {

	public static void main(String[] args) {
//		int[] arr={8,11,23,14,11,9};
//		System.out.println(partitioning(arr,14));
//		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
//		int[] arr={0,1,2,1,1,0,0,1,2,2};
//		quicksort(arr,0,arr.length-1);
//		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
		System.out.println(getPoly(2,3));
		

	}
	public static int partitioning(int[] arr,int pivot){
		int i=0;
		int p=0;
		while(i<arr.length){
			if(arr[i]>=pivot) i++;
			else{
				swap(arr,i,p);
				i++;
				p++;
			}
		}
		return p-1;
	}
	public static void swap(int[]arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static int sort012(int[]arr,int pivot){
		int i=0;
		int j=0;
		int p=0;
		while(j<arr.length){
			if(arr[j]==2){
				j++;
			}
			else if(arr[j]==1){
				swap(arr,i,j);
				i++;
				j++;
			}
			else{
				swap(arr,p,j);
				swap(arr,i,j);
				p++;
				i++;
				j++;
			}
		}
		return p-1;
	}
	public static void quicksort(int[]arr,int lo,int hi){
		if(lo>=hi) return;
		int pi=partitioningqs(arr,lo,hi);
		quicksort(arr,lo,pi-1);
		quicksort(arr,pi,hi);
	}
	public static int partitioningqs(int[] arr,int lo,int hi){
		int pivot=arr[hi];
		int i=lo;
		int p=lo;
		while(i<=hi){
			if(arr[i]>pivot) i++;
			else{
				swap(arr,i,p);
				i++;
				p++;
			}
		}
		return p-1;
	}
	public static int getPoly(int x,int n){
		int sum=n*x;
		int p=x;
		for(int i=n-1;i>=1;i--){
			sum=sum+(i*x*p);
			p=p*x;
		}
		return sum;
	}

}
