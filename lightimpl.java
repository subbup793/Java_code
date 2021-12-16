
public class lightimpl implements switchinf{

	@Override
	public void switchon() {
		System.out.println("switch on the from 6pm to 7am ");
	}
	void switchoff() {
	System.out.println("switch off the light manually, when it not necessary ");
	}
public static void main(String[] args) {
	lightimpl l = new lightimpl();
	l.switchon();
	l.switchoff();
}
}
