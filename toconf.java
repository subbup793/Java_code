
public class toconf {
	public static void main(String[] args) {
		int v = 0;
		int c = 0;
		int s = 0;
		String d = "rock@ TEja";
		char[] y = d.toCharArray();
		int size = y.length;
		int i = 0;
		while (i != size) {
			if ((y[i] >= 'A' && y[i] <= 'Z') || (y[i] >= 'a' && y[i] <= 'z')) {
				if (y[i] == 'a' || y[i] == 'e' || y[i] == 'i' || y[i] == 'o' || y[i] == 'u' || y[i] == 'A'
						|| y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] == 'U') {
					v++;
				} else {
					c++;
				}
			} else {
				s++;
			}
			i++;
		}
		System.out.println(v+" are vowels");
		System.out.println(c+" are c");
		System.out.println(s+" are spl");
	}
}
