package strings;

public class WithoutSplit {

		public void NoSplit(String str) {
			
			char[] chars=str.toCharArray();
			int size=chars.length;
			//String[] fs = new String[words];
			int count=0;
			
			for(int i=0 ;i<size ; i++) {
				
				if(chars[i]==' ') {
					count++; 
				}
				
			}
			int words=count+1;
			System.out.println("Total words in sentense : "  +words);
			String[] fs = new String[words];
			int k=0;
			fs[k]="";
			for(int i=0 ;i<size ; i++) {
				
				if(chars[i]!=' ') {
					fs[k]=fs[k]+chars[i];
					
				}
				else {
					k++;
					fs[k]="";
					
				}
				
			}
			for(int m=0 ; m<words ; m++) {
				System.out.println(fs[m]);
			}
						
			System.out.println(fs);
		}
		
		
		public static void main(String[] args) {
			
			WithoutSplit sort=new WithoutSplit();
			sort.NoSplit("today is tuesday");
			
		}
}
