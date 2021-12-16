
public class run {
	public static void main(String[] args) {
		String s = "to TOT";
		s=s.replace(" ", "");
		s=s.toLowerCase();
		char[] y = s.toCharArray();
		int size = y.length;
		char a[] = new char[size];
		int i = 0;
		while (i != size) {
			a[size-1-i] = y[i];
			i++;
		}
		System.out.println(a);
		i=0;
		while(i!=size) {
			if(a[i]!=y[i]) {
				System.out.println("not a ");
				System.exit(0);
			}
			else {
				i++;
				
			}
		}
		System.out.println("S");
	}
}
