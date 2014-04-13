package regularInnerClasses.example2;

///https://gist.github.com/rajeevprasanna/10519350
public class MyOuter {

	private int x = 7;
	public int y = 8;

	// You can see in the preceding code that the MyOuter code treats MyInner
	// just as though MyInner were any other accessible class it instantiates it
	// using the class name (new MyInner()), and then invokes a method on the
	// reference variable (in.seeOuter()). But the only reason this syntax works
	// is because the outer class instance method code is doing the
	// instantiating. In other words, there's already an instance of the outer
	// class the instance running the makeInner() method		
	public void makeInner() {
		MyInner in = new MyInner(); // make an inner instance
		in.seeOuter();
	}
 
	class MyInner {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
		}	
	} 
	
	private void makeInnerPrivate() {
		SecretClass in = new SecretClass(); // make an inner instance
		in.seeOuter();
	}
	
	private class SecretClass {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
		}	
	} 
}
