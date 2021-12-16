
public class pangram {
public static void main(String[] args) {
	String g = "the quick brown fox jumps over a lazy dog";
	g= g.replace(" ", "");
	char y[] = g.toCharArray();
	int size = y.length;
	int	[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int i=0;
	while(i!=size) {
		int index =y[i]-65;
		a[index]=1;
		i++;
	}
	i=0;
	while (i!=26) {
		if(a[i]==1) {
			i++;
		}
		else {
			System.out.println("not a pan");
			System.exit(0);
		}
	}
	System.out.println("it is a pan");
}
}
