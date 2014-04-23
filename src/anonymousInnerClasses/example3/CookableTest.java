package anonymousInnerClasses.example3;

public class CookableTest {

	public static void main(String[] args) {

		Cookable c2 = new Cookable() {
			@Override
			public void cook() {
				System.out.println("i am anonymous method");
			}
		};

		CookableImp c1 = new CookableImp();
		CookableImp c12 = new CookableImp();
		c1.cook();
		c2.cook();
	}

}
