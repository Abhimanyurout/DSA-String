package in.abhi;

import java.util.Scanner;

public class Print_a_String {
	
	public static void printString(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String :");
		String name = sc.nextLine();
		printString(name);
	}
}
