package in.abhi;

public class RemoveAllWhiteSpace {
	//Approach-1
	public static String printString(String str) {
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)!=' ') {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str=" A b  h    i   ";
		System.out.println(printString(str));
		//Approach-2(using string replaceAll())
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
	}
}
