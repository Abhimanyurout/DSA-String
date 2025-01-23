package in.abhi;

public class HowManyLowerCase_Vowels {
	public static int countLowercaseVowels(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countLowercaseVowels("AbhiManyu"));
	}
}
