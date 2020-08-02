package strings;

public class VowelReplace {
	
	public void ReplaceVowels(String str){
		
		char[] chars=str.toCharArray();
		int size=chars.length;
		System.out.println(size);
		
		for( int i=0 ; i<size ;i++) {
			
			if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u'   ) {
				chars[i]='&';
			}
			
		}
		for(int i=0 ; i<size ; i++) {
			System.out.print(chars[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		VowelReplace sort=new VowelReplace();
		sort.ReplaceVowels("ashokkumar");
		
	}
}
