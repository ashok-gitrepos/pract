package strings;

public class ReplaceSplChars {

	public void splChars(String str) {
		
		String[] s= str.replaceAll("[^a-zA-Z0-9]", " ").split(" " );
		
		/*int r=s.length;
		System.out.println(r);
		for(int i=0;i<r;i++) {
			System.out.print(s[i]+ "  ");
			
		}*/
		
		for(String m :s ) {
			System.out.println(m);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length-1 ; i++) {
			
			sb = sb.append(s[i]).append(s[i]);
		}
		System.out.println(" final string exp is " +sb);
		System.out.println("Final String is " +sb.append(s[s.length-1]).toString());
		
	} 
	
	
	public static void main(String[] args) {
		
		ReplaceSplChars sort = new ReplaceSplChars();
		String str= "ash@12#ch&34tyu";
		sort.splChars(str);
		
		
	}
	
}
