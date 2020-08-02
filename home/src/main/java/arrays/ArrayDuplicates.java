package arrays;

public class ArrayDuplicates {
	
	public void arrDuplicates(int[] arr) {
		
		int arrlen=arr.length;
		
		int[] Duplicatearr = new int[arrlen-1];
		int k=0;
		
		for(int i=0; i<arrlen;i++) {
			for(int j=i+1;j<arrlen;j++) {
				
				if(arr[i]==arr[j]) {
					Duplicatearr[k]=arr[i];
					System.out.print(Duplicatearr[k]+ " ");
					k++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		ArrayDuplicates sort=new ArrayDuplicates();
		int[] arr= {2,2,3,4,6,6,7,8,99,99,122,122,189,189};
		sort.arrDuplicates(arr);
		
	}
	

}
