package strings;

public class UppercaseToLower {

	
	public void ChangeCase(String str) {
		char[] chars = str.toCharArray();
		int size=chars.length;
		
		for(int i=0 ; i<size ;i++) {
			
			
			if(chars[i]>=65 && chars[i]<=90) {
				
				chars[i]=(char) (chars[i]+32);
			}
			else {
				chars[i]=chars[i];
			}
		System.out.print(chars[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		UppercaseToLower sort = new UppercaseToLower();
		sort.ChangeCase("AsHokKuMar");
		
		
	}
}
