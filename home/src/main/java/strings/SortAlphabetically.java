package strings;

public class SortAlphabetically {

	public void AlphabetSort(String[] str) {
	
		int size=str.length;
		System.out.println(size);
		String temp="";
		for(int i=0 ;i<size;i++) {
			for(int j=i+1 ; j<size; j++) {
				if(str[i].compareTo(str[j])>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int j=0 ; j<size ; j++) {
			System.out.println(str[j]);
		}
		
		
	}
		
	public static void main(String[] args) {
		
		SortAlphabetically sorting = new SortAlphabetically();
		String[] str= {"ashok","ram","ben","zack","jess"};
		sorting.AlphabetSort(str);
	}
}
