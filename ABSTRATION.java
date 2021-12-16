
abstract class ABSTRATION {
	void eat() {
		System.out.println("hello");
	}
	abstract void eat (String food); 
}
class me extends ABSTRATION{

	@Override
	void eat(String food) {
		System.out.println(" foodie");
		
	}
	public static void main(String[] args) {
		me m = new me();
		String f = null;
		m.eat(f);
	}
	
}