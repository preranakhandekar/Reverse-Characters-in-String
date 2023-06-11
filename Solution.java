import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
		int i=0;
		char[] ch=str.toCharArray();
		int j=ch.length-1;
		while(i<j){
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			j--;
			i++;
		}
		String s1=new String(ch);
		return s1;
	}
}

/* abc
   Answer=cba
*/
