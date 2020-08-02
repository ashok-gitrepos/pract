package strings;

import java.util.HashMap;  
import java.util.Map;  
import java.util.Set;  
   
public class DuplicateString {  
    public void findIt(String str) {  
        Map<Character, Integer> hm = new HashMap<Character, Integer>();  
        char[] charArray = str.toCharArray();  
        for (Character ch : charArray) {  
            if (hm.containsKey(ch)) {  
                hm.put(ch, hm.get(ch) + 1);  
            } else {  
                hm.put(ch, 1);  
            }  
        }  
        Set<Character> keys = hm.keySet();  
        for (Character ch : keys) {  
            if (hm.get(ch) > 1) {  
                System.out.println(ch + "  is " + hm.get(ch) + " times");  
            }  
        }  
    }  
   
    public static void main(String[] args) {  
    	DuplicateString dcf = new DuplicateString();  
        dcf.findIt("chirumamilla");  
    }  
}  