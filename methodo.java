import java.util.Scanner;

public class methodo {
	String bf;
	static void eat() {
		System.out.println(" eat limitedlty");
	}

	static void eat(String type) {
		System.out.println("break fast or lunch");
	}
	public static void main(String[] args) {
		methodo n = new methodo();
		n.eat();
		Scanner c = new Scanner(System.in);
		String bf = c.nextLine();
		n.eat( bf);
		
		
	}

}
