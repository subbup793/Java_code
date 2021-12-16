import java.util.Scanner;

public class tolowwercase {
	static boolean b;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the text in lower case");
		String T = s.next();
		char[] y = T.toCharArray();
		int size = y.length;
		int i = 0;
		while (i != size) {
			y[i] = (char) (y[i] - 32);
			i++;
		}

		System.out.println(y);
		System.out.println("enter text in upper case");
		String te = s.next();
		s.close();
		char[] x = te.toCharArray();
		int r = x.length;
		i = 0;
		while (i != r) {
			x[i] = (char) (x[i] + 32);
			i++;
		}

		System.out.println(x);

	}

}
