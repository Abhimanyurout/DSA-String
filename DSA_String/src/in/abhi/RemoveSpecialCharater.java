package in.abhi;

public class RemoveSpecialCharater {
	public static void main(String[] args) {
		String str="&%A($b!h*i)";
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);
	}
}
