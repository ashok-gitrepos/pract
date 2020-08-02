package strings;

import java.util.Scanner;
public class Trail{
	


   public  void split(String st)
   {
      //converts string into character array
      char ch[]=st.toCharArray();
      int count=0;//initialize the count
 
      //for-loop to count the number of words
      for (int i = 0; i < ch.length; i++)
      {
         if (ch[i]==' ')
         {
            count++;
         }
      }
 
      //Create String array to hold result Size of the array will be count+1
      String str[]=new String[count+1];
      int k=0;
      str[k]="";
      for (int i = 0; i < ch.length; i++)
      {
         //concatenate each character of a word
         if (ch[i]!=' ')
         {
            str[k]=str[k]+ch[i];
         }
         else
         {
            k++;
            str[k]="";
         }
      }
      System.out.println(str);;
   }
   public static void main(String[] args)
   {
	   Trail sort = new Trail();
	   sort.split("hello how are you");
   }
}