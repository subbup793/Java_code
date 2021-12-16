
public class fun5 {

	public static void main(String[] args) {
		String t = "78980";
		char[] y = t.toCharArray();
		int size = y.length;
		int i = 0;
		while (i != size) {
			if (y[i]>=0&&y[i]<=9) {
			i++;
			}
			else {
				System.out.println("not a integer string ");
				System.exit(0);
			}
		}
		System.out.println("integer string");
	}

}
