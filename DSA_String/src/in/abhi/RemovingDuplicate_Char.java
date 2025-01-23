package in.abhi;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicate_Char {
	public static void main(String[] args) {
		String str="Aaaaabhimanyu Rout";
		//Approach-1
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i+1);
			if(idx==-1) {
				sb.append(ch);
			}
			
		}
		System.out.println(sb);
		//Approach-2
//		String str2="Aaaaabhimanyu Rout";
//		char[] arr = str2.toCharArray();
//		StringBuilder sb1=new StringBuilder();
//		for(int i=0;i<arr.length;i++) {
//			boolean repated=false;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					repated=true;
//					break;
//				   }
//				}
//			if(!repated) {
//					sb1.append(arr[i]);
//			}
//			System.out.println(sb1);
//		}
		
		//Approach-3
		StringBuilder sb3=new StringBuilder();
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0; i<str.length();i++) {
			set.add(str.charAt(i));
			
		}
		for(Character c: set) {
			sb3.append(c);
		}
		System.out.println(sb3);
	}
}


















