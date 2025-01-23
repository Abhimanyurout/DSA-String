package in.abhi;


import java.util.Scanner;

public class PalindromeString {
	public static boolean isPalindome(String str) {
		for(int i=0; i<str.length()/2;i++) {
			int n=str.length();
			if(str.charAt(i) != str.charAt(n-1-i)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A string :");
		
		String str = sc.nextLine();
		System.out.println(isPalindome(str));
	}
}
