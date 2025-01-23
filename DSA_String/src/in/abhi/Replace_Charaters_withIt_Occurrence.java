package in.abhi;

import java.util.Arrays;

public class Replace_Charaters_withIt_Occurrence {
	public static void main(String args[]) {
		String input="opentext";
		char charToReplace='t';
		//op==> open1ex2
		//check char is presence in string
		if(input.indexOf(charToReplace)==-1) {
			System.out.println("Charater is not present in the string...");
			System.exit(0);
		}
		
		//if char is present
		//Logic to replace char 
		char[] arr = input.toCharArray();
		int cnt=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==charToReplace) {
				arr[i]=String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		
	}
}
