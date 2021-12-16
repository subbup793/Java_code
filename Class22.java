
public class Class22 {
	int i;
	double r;
	static String son;

	Class22(int i) {
		this(10, 7.9);
		r = 0;
		i = i;
		son = "null";
		System.out.println(r + " " + i + " " + son);
	}

	Class22(int i, double r) {
		this(9, 7.9, "ROCK");
		r = r;
		i = i;
		son = "null";
		System.out.println(r + " " + i + " " + son);
	}

	Class22(int i, double r, String s) {
		r = r;
		i = i;
		son = s;
		System.out.println(r + " " + i + " " + son);
	}

	public static void main(String[] args) {
		Class22 c = new Class22(9);
	}

}
