package arrays;

public class ArrayReverse {
	
	public void reverseArr(int[] arr) {
		
		Integer arLen=arr.length;
		
		int[] newArray = new int[arLen];
		for(int i=0 ;i<arLen-1 ;i++) {
			
			for(int j=arLen-1 ;j>=0;j--) {
				newArray[j]=arr[i];
				i++;
			}
			
				for(int j=0 ;j<=arLen-1 ;j++) {
					System.out.print(newArray[j]+" ");
			}
			
			
		}
		
	}
	
	public static void main (String[] args) {
		
		ArrayReverse sort=new ArrayReverse();
		int[] arr= {2,3,4,5,6,345,345,56,6434,98765};
		sort.reverseArr(arr);
		
	}

}
