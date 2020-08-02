package strings;

public class RemoveDuplicates {
	
	public void remDuplictes(String str) {
		char[] chars = str.toCharArray();
		int n=chars.length;
		
		for(int i=0 ;i<n;i++) {
			int count=1;
			for(int j=i+1 ; j<n ;j++) {
				if(chars[i]==chars[j]) {
					count++;
					System.out.println("Duplicate character is "+chars[i] + " and its count is  " +  count);
				}
				else {
					
					//System.out.println("Final String  "+chars[i]+" ");
				}
				
			}
			
		}
		
	}

	
	public static void main(String[] args) {
		
		RemoveDuplicates sort = new RemoveDuplicates();
				sort.remDuplictes("ashokandramko");
	}
	
}
