package arrays;

public class ArrayAsc {

	
	public void Ascending(Integer[] arr) {
		
		int arrLen = arr.length;
		//System.out.println(arrLen);	
		
		int temp;
		for(int i=0 ; i<arrLen-1 ; i++) {
			for(int j=i+1 ; j<arrLen-1 ;j++) {
				
				if(arr[i]>arr[j]){
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				
				for(int i=0 ; i<arrLen ; i++) {
					
                  System.out.print(arr[i]+" ")	;			}
	}
	
	
	
	public static void main(String[] arg) {
		
		ArrayAsc sort=new ArrayAsc();
		Integer[] arr= {2,34,566,23,7777,1,78};
		
		sort.Ascending(arr);
		
	}
}
