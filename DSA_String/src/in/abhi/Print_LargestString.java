package in.abhi;

public class Print_LargestString {
	public static void main(String[] args) {
		String str[]= {"apple","mango","banana"};
		String largest=str[0];
		for(int i=1;i< str.length;i++) {
			if(largest.length()<str[i].length()) {
				largest=str[i];
			}
		}
		System.out.println(largest);
	}
}
