import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String x = "anagram";
		String y = "nagaram";
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean res=Arrays.equals(a, b);
		if(res==true) {
			System.out.println("Anagram" );
		}
		else {
			System.out.println("non");
		}
	}
}
