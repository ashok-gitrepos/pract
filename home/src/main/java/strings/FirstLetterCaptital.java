package strings;

public class FirstLetterCaptital {

	public void makeFirstCapital(String str) {
		
		char[] chars=str.toCharArray();
		int size=chars.length;
		String finalstring ="";
		for(int i=0 ; i<size ; i++) {
			if(i==0 || chars[i-1]==' ')  {
				
				if(chars[i]>=97 && chars[i]<=122) {
					chars[i]= (char) (chars[i]-32);
					finalstring=finalstring+chars[i];
				}
				else {
					chars[i]=chars[i];
					
					finalstring=finalstring+chars[i];
				}
			}
			else if(chars[i]>=65 && chars[i]<=90) {
				
				chars[i]=(char) (chars[i]+32);
				finalstring=finalstring+chars[i];
			}
			else {
				finalstring=finalstring+chars[i];				
			}
	
		}
		System.out.println(finalstring);
	}
	
	
	public static void main(String[] args) {
		
		FirstLetterCaptital sort=new FirstLetterCaptital();
		sort.makeFirstCapital("today aint sunday");
		
	}
	
}
