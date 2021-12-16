import java.util.Scanner;

public class lnstring {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		t = t.concat("\0");
		char[] y = t.toCharArray();
		int i=0;
		int c=0;
		
		while(y[i]!='\0') {
			c++;
			i++;
		}
			System.out.println(c);
		}
	}

