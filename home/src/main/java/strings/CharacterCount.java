package strings;

public class CharacterCount {

	
	public void CharCount(String str) {

		String[] words=str.split(" ");
		int count=words.length;
		StringBuilder sb=new StringBuilder();
		for(int i=0 ;i<count ;i++) {
			sb=sb.append(words[i]);
		}
		String finalString=sb.toString();
		System.out.println(finalString);
		
		char[] chars =finalString.toCharArray();
		int n=finalString.length();
		
		for (int i=0 ;i<n;i++) {
			int charCount=1;
			for(int j=i+1 ; j<n ;j++) {
				
				if(chars[i]==chars[j]) {
					charCount++;
					 for (int k=j;k<n-1 ;k++ ) {
	                        chars[k]=chars[k+1];
	                    }
	                    j--;
	                   n--;
				}
				
				
			}
			 System.out.println(chars[i]+"="+charCount);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		CharacterCount sort = new CharacterCount();
		sort.CharCount("ashok and ram");
		
	}
}
