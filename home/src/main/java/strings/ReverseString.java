package strings;

public class ReverseString {
	
	public void reverseString(String str) {
		
		
		String[] arr = str.split(" ");
		int size = arr.length;
		String ReverseString= " ";
		
		for(int i=size-1; i >=0 ; i--) {
			String ReverseWord = " ";
			for(int j=(arr[i].length())-1; j>=0; j--) {
				ReverseWord = ReverseWord + arr[i].charAt(j); 
			
			}
		ReverseString = ReverseString+" " +ReverseWord;
			
			}
			
		System.out.println("Final String" +ReverseString);
		}
	
	public static void main(String[] args) {
		//rstr ReverseString();
		ReverseString rstr=new ReverseString();
		rstr.reverseString("this sounds good");
		
	}

}
