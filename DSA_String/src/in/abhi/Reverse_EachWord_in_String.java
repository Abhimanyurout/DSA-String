package in.abhi;

public class Reverse_EachWord_in_String {
	public static void main(String[] args) {
		String input="Abhi Rout";
		System.out.println("Orinal String : "+input);
		
		String output="";
		
		String[] words = input.split(" ");
		for(String word : words) {
			String revWord="";
			for(int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
			output=output+revWord+" ";
		}
		System.out.println("Reverse String :"+output);
	}
}
