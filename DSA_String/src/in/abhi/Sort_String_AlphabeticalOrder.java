package in.abhi;

import java.util.Arrays;

public class Sort_String_AlphabeticalOrder {
	public static void main(String[] args) {
		String str="abhimanyu";
		
		char[] ch = str.toCharArray();
		
		char temp;
		for(int i=0; i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(new String(ch));
		
		//Approach-2
		String str1="java";
		char[] arr = str1.toCharArray();
		Arrays.sort(arr);
		System.out.println(new String(arr));
	}
}













